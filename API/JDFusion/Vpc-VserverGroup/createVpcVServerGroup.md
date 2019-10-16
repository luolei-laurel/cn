# createVpcVServerGroup


## 描述
创建虚拟服务器组，并添加后端服务器

## 请求方式
POST

## 请求地址
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vserverGroups

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**authorization**|String|True| |获取方式请参考签名算法指导文档|
|**vserverGroup**|CreateVserverGroup|True| |创建虚拟服务器组|
|**x-jdcloud-date**|String|True| |获取方式请参考签名算法指导文档|
|**x-jdcloud-fusion-cloudid**|String|True| |云注册信息ID|
|**x-jdcloud-nonce**|String|True| |获取方式请参考签名算法指导文档|

### CreateVserverGroup
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**backendServers**|BackendServer[]|False| |安全组权限规则集合|
|**loadBalancerId**|String|False| |负载均衡实例ID|
|**vserverGroupName**|String|False| |服务器组名称|
### BackendServer
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**cloudID**|String|False| |所属云ID|
|**port**|Integer|False| |后端服务器端口。|
|**serverHealthStatus**|String|False| |负载均衡实例的名称。|
|**serverId**|String|False| |负载均衡实例ID。|
|**type**|String|False| |后端服务器类型。|
|**weight**|Integer|False| |后端服务器的权重。|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|请求ID|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**task**|ResourceTFInfo| |
### ResourceTFInfo
|名称|类型|描述|
|---|---|---|
|**body**|String|请求体|
|**cloudId**|String|cloud ID|
|**createdTime**|String|创建时间|
|**provider**|String|cloud provider|
|**result**|String|执行结果|
|**status**|String|状态|
|**updateTime**|String|更新时间|
|**userId**|String|user ID|
|**uuid**|String|uuid|

## 返回码
|返回码|描述|
|---|---|
|**201**|CREATED|
