# deleteKeypair


## 描述
删除ssh密钥对。


## 请求方式
DELETE

## 请求地址
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs/{keyName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|
|**keyName**|String|True| |密钥名称|

## 请求参数
无


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
