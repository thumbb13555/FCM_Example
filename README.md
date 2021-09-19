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
 "to" : "cPJ5JC0CS8KPU8IVILLYgX:APA91bFAVawRH0uGngTm7YyhoX7mJ8oEGRH9KAOQwKcTxbjF9-li0epX8FusnFnHbxHi-BXf5pkmOZG51NmfZavwIj2iC-UJDXiU73_xjQ4EZJbHCw8CilWUAD5tldXPONecIpSWhCLS",
 "collapse_key" : "type_a",
 
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
  
  
