# 获取视频任务列表

描述:通过条件查询视频列表

请求语法：
```
GET searchVideoList&videoTaskQuery=videoTaskQuery HTTP/1.1
Host: oss.cn-north-1.jcloudcs.com
Date: date
Authorization: signatureValue#请参照《安全认证》
```
说明：

* videoTaskQuery：查询任务列表，JSON格式，相关说明参数如下：

* bucket：源bucket

* objectKey：源Key

* taskId：任务uuid

* status：任务的状态，1是未处理，2是开始处理，3是处理成功

* page：显示页数

* pagesize：每页显示数量

* flag：1代表有效

请求示例：
```
GET http://oss.cn-north-1.jcloudcs.com/?searchVideoList&videoTaskQuery=%7B%22flag%22%3A0%2C%22mysqlPage%22%3A0%2C%22orderCloumn%22%3A%22update_time%22%2C%22orderType%22%3A%22desc%22%2C%22page%22%3A1%2C%22pageSize%22%3A10%2C%22status%22%3A0%7DHTTP/1.1
Date: Tue, 15 Dec 2015 12:59:11 GMT
Authorization: jingdong 2sTXh1AoApNv5x8p:opNHt6cimASzR20CcsglKbpSaxQ=
Content-Length: 0
Host: oss.cn-north-1.jcloudcs.com
Connection: Keep-Alive
User-Agent: JFS-JCLOUD-SDK-JAVA/1.0.0 (Java 1.8.0_45; Vendor Oracle Corporation; Windows 7 6.1; HttpClient 4.2.1)
```

响应示例：
```
HTTP/1.1 200 OK
x-jss-request-id: AF4C3B343F152E1A
Server: JSS/1.0
Content-Type: application/json;charset=UTF-8
Content-Length: 504
Date: Tue, 15 Dec 2015 13:09:03 GMT
{"total":2,"page":1,"videoResultList":[{"taskId":"03a81cda7ac841d69191b5666687cdb5","status":1,"bucket":"jfs-m3","objectKey":"fidd.wmv","options":"av/fmt/mp4/s/1920/1080/vb/1500000/ab/128000/saveas/a2trOmFiYy53bXY","updateTime":1449166599000,"taskOutputObjectList":null},{"taskId":"11311576e2ee46d3b11dd4672d8e13c4","status":1,"bucket":"jfs-m3","objectKey":"fidd.wmv","options":"av/fmt/mp4/s/1920/1080/vb/1500000/ab/128000/saveas/a2trOmFiYy53bXY","updateTime":1449166260000,"taskOutputObjectList":null}]}
```
