package com.noahliu.fcm_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationTarget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_target);
        String result = getIntent().getStringExtra("data");

        TextView tvResult = findViewById(R.id.textView_Result);
        tvResult.setText("收到訊息：\n"+result);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(result));
        startActivity(intent);
        finish();

    }
}