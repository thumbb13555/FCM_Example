## 指定某裝置發送
 ### 基本URL
 * https://fcm.googleapis.com/fcm/send

 ### Headers: 
 * Authorization: FCM分配的你的key=...
 * Content-Type: application/json
 * User-Agent: Mozilla/5.0
 ### Body: 
 
 ```json
{
 "to" : "cPJ5JC0CS8..."
 
 "data" : {
     "body" : "快來看看我的官網!",
     "title": "來嘛來嘛",
     "key_1" : "http://thumbb13555.pixnet.net/blog",
     "key_2" : "Value for key_2",
     "key_3" : "Value for key_2",
     "image":"https://pic.pimg.tw/thumbb13555/1571459281-3506977154_l.jpg"
  }
}
  ```
  
  ## 組發送
 ### 基本URL
 * https://fcm.googleapis.com/fcm/send

 ### Headers: 
 * Authorization: FCM分配的你的key=...
 * Content-Type: application/json
 * User-Agent: Mozilla/5.0
 ### Body: 
 
 ```json
{
 "to" : "/topics/news",
 "collapse_key" : "type_a",
 
 "data": {
     "body" : "快來看看我的官網!",
     "title": "來嘛來嘛",
     "key_1" : "http://thumbb13555.pixnet.net/blog",
     "key_2" : "Value for key_2",
     "key_3" : "Value for key_2",
     "image":"https://pic.pimg.tw/thumbb13555/1571459281-3506977154_l.jpg"
  }
}
  ```
  
 ## Notification body(發送純通知，不帶參數)
 ### 基本URL
 * https://fcm.googleapis.com/fcm/send

 ### Headers: 
 * Authorization: FCM分配的你的key=...
 * Content-Type: application/json
 * User-Agent: Mozilla/5.0
 ### Body: 
 
 ```json
{
 "to" : "cPJ5JC0CS8...",
 "collapse_key" : "type_a",
 "notification" : {
     "body" : "快來看看我們的新產品吧",
     "title": "由postman發送!",
     "click_action": "com.noahliu.notificationdemo.TARGET",
     "color": "#53c4bc",
     "image": "https://pic.pimg.tw/thumbb13555/1571459281-3506977154_l.jpg",
     "icon": "ic_baseline_notifications_24"
     
     
 },
 "data" : {
     "body" : "快來看看我們的新產品吧",
     "title": "新產品IAQ上市囉!!",
     "key_1" : "http://thumbb13555.pixnet.net/blog",
     "key_2" : "Value for key_2",
     "key_3" : "Value for key_2",
     "image":"https://pic.pimg.tw/thumbb13555/1571459281-3506977154_l.jpg"
 }
}
  ```
  
  
