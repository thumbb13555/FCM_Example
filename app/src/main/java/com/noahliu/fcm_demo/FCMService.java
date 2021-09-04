package com.noahliu.fcm_demo;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class FCMService extends FirebaseMessagingService {
    public static final String TAG = FCMService.class.getSimpleName()+"My";
    private String CHANNEL_ID = "Coder";
    public FCMService() {}

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.d(TAG, "裝置Token: "+s);
    }

    @SuppressLint("UnspecifiedImmutableFlag")
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "onMessageReceived: " + remoteMessage.getData());

        /**檢查手機版本是否支援通知；若支援則新增"頻道"*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID, "DemoCode", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            assert manager != null;
            manager.createNotificationChannel(channel);

        }
        Map<String,String> s = remoteMessage.getData();
        Intent intent = new Intent(this,NotificationTarget.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("data",s.get("key_1"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0
                ,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        /**建置通知欄位的內容*/
        NotificationCompat.Builder builder
                = new NotificationCompat.Builder(FCMService.this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_fiber_new_24)
                .setContentTitle(s.get("title"))
                .setContentText(s.get("body"))
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setContentIntent(pendingIntent);

        /**發出通知*/
        NotificationManagerCompat notificationManagerCompat
                = NotificationManagerCompat.from(FCMService.this);
        notificationManagerCompat.notify(1,builder.build());
    }
}