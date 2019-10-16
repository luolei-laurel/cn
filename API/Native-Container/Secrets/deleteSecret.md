# deleteSecret


## 描述
删除单个 secret


## 请求方式
DELETE

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/secrets/{name}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**name**|String|True| |Secret Name|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
