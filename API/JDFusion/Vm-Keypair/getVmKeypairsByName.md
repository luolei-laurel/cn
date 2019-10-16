# getVmKeypairsByName


## 描述
根据云提供商查询对应的密钥对资源信息

## 请求方式
GET

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vm_keypairs/{name}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**name**|String|True| |keypair name|
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
|**keypair**|KeypairInfo| |
### KeypairInfo
|名称|类型|描述|
|---|---|---|
|**cloudID**|String|云注册信息ID|
|**keyFingerprint**|String|密钥指纹|
|**name**|String|密钥名称|

## 返回码
|返回码|描述|
|---|---|
|**200**|ok|
|**404**|not found|
