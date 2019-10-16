# describeInstanceAttributes


## 描述
查询RDS实例（MySQL、SQL Server等）的详细信息以及MySQL只读实例详细信息

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS 实例ID，唯一标识一个RDS实例|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**dbInstanceAttributes**|DBInstanceAttribute| |
### DBInstanceAttribute
|名称|类型|描述|
|---|---|---|
|**instanceId**|String|实例ID|
|**instanceName**|String|实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)|
|**instanceType**|String|实例类型，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**engine**|String|实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**engineVersion**|String|实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**instanceClass**|String|实例规格代码|
|**instanceStorageGB**|Integer|磁盘，单位GB|
|**instanceCPU**|Integer|CPU核数|
|**instanceMemoryMB**|Integer|内存大小，单位MB|
|**regionId**|String|地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)|
|**azId**|String[]|可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)|
|**vpcId**|String|VPC的ID|
|**subnetId**|String|子网的ID|
|**internalDomainName**|String|实例内网域名|
|**publicDomainName**|String|实例公网域名|
|**instancePort**|String|应用访问端口|
|**connectionMode**|String|访问模式，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**auditStatus**|String|审计状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**instanceStatus**|String|实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)|
|**createTime**|String|实例创建时间|
|**charge**|Charge|计费配置|
|**primaryNode**|DBInstanceNode|高可用集群中主节点的信息<br>- 仅支持SQL Server|
|**secondaryNode**|DBInstanceNode|高可用集群中从节点的信息<br>- 仅支持SQL Server|
|**tags**|Tag[]|标签信息|
### Tag
|名称|类型|描述|
|---|---|---|
|**key**|String|标签键|
|**value**|String|标签值|
### DBInstanceNode
|名称|类型|描述|
|---|---|---|
|**id**|String|节点id|
|**name**|String|节点名称|
|**status**|String|节点状态|
### Charge
|名称|类型|描述|
|---|---|---|
|**chargeMode**|String|支付模式，取值为：prepaid_by_duration，postpaid_by_usage或postpaid_by_duration，prepaid_by_duration表示预付费，postpaid_by_usage表示按用量后付费，postpaid_by_duration表示按配置后付费，默认为postpaid_by_duration|
|**chargeStatus**|String|费用支付状态，取值为：normal、overdue、arrear，normal表示正常，overdue表示已到期，arrear表示欠费|
|**chargeStartTime**|String|计费开始时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ|
|**chargeExpiredTime**|String|过期时间，预付费资源的到期时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ，后付费资源此字段内容为空|
|**chargeRetireTime**|String|预期释放时间，资源的预期释放时间，预付费/后付费资源均有此值，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
