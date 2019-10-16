# **分区域运营商详细数据统计**

## **1. 描述**

分区域运营商详细数据统计 (area_isp_data)

## **2. 请求参数**

| **名称**   | **类型** | **是否必填** | **描述**                                                    |
| ---------- | -------- | ------------ | ----------------------------------------------------------- |
| username   | String   | 是           | 京东用户名pin                                               |
| signature  | String   | 是           |  用户签名，通过md5的方式校验用户的身份信息，保障信息安全。</br>md5=日期+username+秘钥SecretKey; 日期：格式为 yyyymmdd; username：京东用户名pin; 秘钥：双方约定; </br>示例：比如当前日期2016-10-23,用户pin:jcloud_00,用户秘钥SecretKey：e7a31b1c5ea0efa9aa2f29c6559f7d61,那签名为MD5(20161023jcloud_00e7a31b1c5ea0efa9aa2f29c6559f7d61)  |
| domain     | String   | 是           | 待查询的域名，支持多域名查询，参数示例“www.a.com,www.b.com” |
| start_time | String   | 是           | 时间格式：yyyy-mm-dd hh:mi 参考示例：2016-12-14 07:00       |
| end_time   | String   | 否           | 不是必填参数，不传默认到当前时间                            |


## **3. 返回参数**

| **名称** | **描述**                                        |
| -------- | ----------------------------------------------- |
| status   | 表示接口请求成功与否，成功用0表示，其他表示失败 |
| msg      | 提示信息                                        |
| data     | 返回数据                                        |

## **4. 调用示例**

- ### **请求地址**

https://opencdn.jcloud.com/api/live/area_isp_data

- ### **请求示例**

https://opencdn.jcloud.com/api/live/area_isp_data
```
{
    "username" :"test_user",
    "signature" :"d847267fc702273abf394dd0c3128d64",
    "domain" :"www.a.com,www.b.com",
    "start_time" :"2016-12-14 07:00",
    "end_time" :"2016-12-14 12:59"
 }
```

- ### **返回说明**

* json格式

```
{
"status": 0,//0 表示本次请求成功
"data": [
[
TS, //时间戳,
AREA, //区域
ISP, //运营商
BANDWIDTH, //带宽,单位:Mbps
flow,//流量,单位:MB
],
]
}
```

- ### **返回示例**

* json格式

```
{
    "status": 0,
    "msg": "成功",
    "data": [
        {
            "domain": "www.a.com",
            "data": [
                [
                    "1513533900",
                    "neimenggu",
                    "ct",
                    1.4548978805541992,
                    34.147540288671976,
                ],
                [
                    "1513533900",
                    "neimenggu",
                    "cmcc",
                    20,
                    29268.666015625
                ]

]
]
}
```
