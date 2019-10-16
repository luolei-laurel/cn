# openLiveTimeShift


## 描述

开启时移

- 直播支持最大4小时的HLS时移，使用方式为在播放域名后增加时移参数来实现，参数类型支持指定开始时间和时间偏移量2种方式进行时移。
开启直播时移后，重新推流生效，使用播放域名带相应参数访问即可播放。

- 域名格式：
1、http://{domainName}/live/{streamName}/index.m3u8?timeshift=400（秒，指从当前时间往前时移的偏移量）
2、http://{domainName}/live/{streamName}/index.m3u8?starttime=1529223702 (unix时间戳)


## 请求方式
PUT

## 请求地址
https://live.jdcloud-api.com/v1/liveTimeShift:open


## 请求参数
|名称|类型|是否必需|描述|
|---|---|---|---|
|**playDomain**|String|True|直播的推流域名|

## 示例
    {
       
        "playDomain":"play.yourdomain.com"
    }

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|requestId|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
