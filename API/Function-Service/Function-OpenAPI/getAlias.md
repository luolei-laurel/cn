# getAlias


## 描述
查询别名详情

## 请求方式
GET

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
|**result**|Result|别名详情返回值|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Alias| |
### Alias
|名称|类型|描述|
|---|---|---|
|**aliasId**|String|别名Id|
|**aliasName**|String|别名名称|
|**description**|String|别名描述信息|
|**functionName**|String|别名对应的函数名称|
|**version**|String|别名对应的版本名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
