# getVpcEips


## 描述
根据云提供商查询对应的公网IP资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_eips

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
|**eipAddresses**|EipAddress[]| |
### EipAddress
|名称|类型|描述|
|---|---|---|
|**allocationTime**|String|EIP的创建时间|
|**bandwidth**|String|EIP的带宽峰值，单位为Mbps|
|**cloudID**|String|云注册信息ID|
|**id**|String|公网IP ID|
|**instanceId**|String|当前绑定的实例ID|
|**instanceType**|String|当前绑定的实例类型|
|**ipAddress**|String|公网IP地址|
|**status**|String|状态|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
