# getVpcs


## 描述
查询私有网络资源列表

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vpcs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|False| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**vpcs**|VpcInfo[]| |
### VpcInfo
|名称|类型|描述|
|---|---|---|
|**cidrBlock**|String|地址范围|
|**cloudID**|String|所属云提供商ID|
|**createdTime**|String|创建时间|
|**description**|String|VPC 描述|
|**id**|String|Vpc的Id|
|**name**|String|私有网络名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
