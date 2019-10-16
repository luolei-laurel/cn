# getRdsDatabasesByInstId


## 描述
根据过滤条件，取得指定RDS实例上的数据库信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/rds_instances/{instId}/databases

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instId**|String|True| |RDS实例ID|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**dbs**|RdsDBInfo[]| |
### RdsDBInfo
|名称|类型|描述|
|---|---|---|
|**accountPrivileges**|RdsDBAccessPrivilege[]| |
|**characterSetName**|String|字符集|
|**cloudID**|String|所属云提供商ID|
|**name**|String|数据库名称|
|**status**|String|数据库状态|
### RdsDBAccessPrivilege
|名称|类型|描述|
|---|---|---|
|**accountName**|String|账号名称|
|**cloudID**|String|所属云提供商ID|
|**privilege**|String|账号对数据库所具有的权限|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|RDS instance not found|
