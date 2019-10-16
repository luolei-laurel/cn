# deletePod


## 描述
pod 状态必须为 stopped、running 或 error状态。 <br>
按量付费的实例，如不主动删除将一直运行，不再使用的实例，可通过本接口主动停用。<br>
只能支持主动删除按量计费类型的实例。包年包月过期的 pod 也可以删除，其它的情况还请发工单系统。计费状态异常的容器无法删除。


## 请求方式
DELETE

## 请求地址
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

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
