# 错误响应结构

在与 API 交互有错误发生时，云存储服务端的响应（Response）包括：

1. 相应的 HTTP 3xx，4xx 与 5xx 状态码（HTTP Status）

2. JSON格式的消息体

下面是返回JSON样例：
```
{“code”   :”AccessDenied”,”message”:”Access   Denied”,”resource”:”/mybucket/public/index.html”,
”requestId”:”71515159-E06D-406F-81C4-E03FA635B831”}
```

下面的表格中介绍了每一个元素（Element）的意义：

|名称|描述|
|-|-|
|code|错误代码|
|message|错误消息的描述，可以通过此信息来初步定位问题所在。|
|RequestId|标识请求的唯一 ID。|
|Resource|包含了 Bucket 或 Object 的请求资源描述符。|
