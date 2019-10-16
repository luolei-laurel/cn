# exchangeInstanceDns


## 描述
交换两个实例的域名，包括内网域名和外网域名。如果一个实例有外网域名，一个没有，则不允许交换。<br>- 仅支持SQL Server

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:exchangeInstanceDns

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS 实例ID，唯一标识一个RDS实例|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**targetInstanceId**|String|True| |要交换的实例ID|


## 返回参数
无


## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
