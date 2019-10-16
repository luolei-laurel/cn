### 1、登录京东云控制台
![img](https://github.com/jdcloudcom/cn/blob/edit/image/HTTPDNS/%E7%99%BB%E5%BD%95%E6%8E%A7%E5%88%B6%E5%8F%B0.png)

### 2、选择域名服务>HTTPDNS
![img](https://github.com/jdcloudcom/cn/blob/edit/image/HTTPDNS/HTTP%20DNS%E9%A1%B5%E9%9D%A2.png)
### 3、点击域名管理图标添加需要使用的域名

![img](https://github.com/jdcloudcom/cn/blob/edit/image/HTTPDNS/%E6%B7%BB%E5%8A%A0%E5%9F%9F%E5%90%8D.png)                   

### 4、使用HTTP DNS 接口解析域名

HTTP DNS采用HTTP接口对外提供域名解析服务，服务接入地址在账户概览页面查看，每个用户都有两个服务IP地址，一个服务地址异常时，可尝试另一个服务地址。

| 请求方式 | HTTP GET                                                     |
| -------- | ------------------------------------------------------------ |
| 服务URL  | http://{服务地址}/v1/{Account_id}/d   {服务地址}: 在控制台账户概览页面，接入地址栏中获取   {Account_id}：在控制台账户概览页面，账户信息栏获取 |

URL参数说明：

| 参数名称 | 参数类型   | 是否必须 | 描述                                                         |
| -------- | ---------- | -------- | ------------------------------------------------------------ |
| dn       | 域名       | 是       | 要解析的域名，多个域名采用逗号分隔                           |
| ip       | IPv4地址   | 否       | 客户端地址                                                   |
| t        | Unix时间戳 | 是       | 签名失效时间，1970年1月1日以来的秒数（整形正数），不能超过当前时间24小时 |
| s        | 字符串     | 是       | 鉴权字符串，生成规则参考如下鉴权算法                         |

 

鉴权算法：

s = md5sum(dn-key-t)

鉴权字段说明

| dn   | 需要被解析的域名，与URL中的参数dn相同    |
| ---- | ---------------------------------------- |
| key  | 用户鉴权密钥，从用户控制台账户信息栏获取 |
| t    | 鉴权失效时间，与URL中的参数t相同         |

 

示例：

| 示例参数     | 参数值                                                       |
| ------------ | ------------------------------------------------------------ |
| {服务地址}   | 103.224.222.208                                              |
| {Account_id} | 123456                                                       |
| 待解析域名   | [www.jdcloud.com](http://www.jdcloud.com)                    |
| 客户端IP     | 1.1.1.1                                                      |
| 用户密钥     | testKey                                                      |
| 鉴权失效时间 | 1544612446                                                   |
| 鉴权字符串   | s=md5sum([www.jdcloud.com-testKey-1544612446](http://www.jdcloud.com-testKey-1544612446))   即fec6da1a46911f77a455908a124f4142 |

完整请求：

http:// 103.224.222.208 /123456/v1/d?dn=www.jdcloud.com&ip= 1.1.1.1&t=1544612446&s= fec6da1a46911f77a455908a124f4142

 

请求成功：

​         HTTP响应状态码为200 OK，响应结果为JSON格式，示例如下：

{

"ret_code":0,

"msg":"Success",

"data":[{

"domain":"www.jdcloud.com",

"ips":[" 101.124.93.21 "," 101.124.18.188"],

"ttl":600

}]

}

请求失败：HTTP响应状态码为4XX，响应结果为JSON格式，示例如下：

{

"ret_code":10015,

"msg":"Query domain is not in access domain list",

"data":"www.test.com"

}

 

| 名称     | 描述                                                         |
| -------- | ------------------------------------------------------------ |
| ret_code | 请求响应，成功为0，失败非0                                   |
| msg      | 响应结果描述信息，成功为”success”,失败提示详细信息           |
| data     | 响应数据，请求成功时为域名解析结果，失败时为string类型，可以为空，或更详细的错误提示 |
| domain   | 解析域名                                                     |
| ips      | 解析结果                                                     |
| ttl      | 记录TTL                                                      |
