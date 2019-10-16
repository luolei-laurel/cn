# deleteAlias


## 描述
删除别名

## 请求方式
DELETE

## 请求地址
https://function.jdcloud-api.com/v1/regions/{regionId}/functions/{functionName}/aliases/{aliasName}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**aliasName**|String|True| |别名名称|
|**functionName**|String|True| |别名所属函数名称|
|**regionId**|String|True| |Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|本次请求Id|


## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
