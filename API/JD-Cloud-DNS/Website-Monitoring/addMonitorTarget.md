# addMonitorTarget


## 描述
添加子域名的某些特定监控对象为监控项

## 请求方式
POST

## 请求地址
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitorAddTarget

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**domainId**|String|True| |域名ID，请使用getDomains接口获取。|
|**regionId**|String|True| |实例所属的地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**subDomainName**|String|True| |子域名|
|**targets**|String[]|True| |子域名可用监控对象的数组|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|此次请求的ID|


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
