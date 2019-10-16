# describeSlowLogs


## 描述
查询MySQL实例的慢日志的概要信息。<br>- 仅支持MySQL

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/performance:describeSlowLogs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)|
|**instanceId**|String|True| |RDS 实例ID，唯一标识一个RDS实例|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**startTime**|String|True| |慢日志开始时间,格式为：YYYY-MM-DD HH:mm:ss,开始时间到结束时间不能大于30天,结束时间不能大于当前时间|
|**endTime**|String|True| |慢日志结束时间,格式为：YYYY-MM-DD HH:mm:ss,开始时间到结束时间不能大于30天,结束时间不能大于当前时间|
|**dbName**|String|False| |查询哪个数据库的慢日志，不填表示返回所有数据库的慢日志|
|**pageNumber**|Integer|False| |显示数据的页码，默认为1，取值范围：[-1,1000)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页。|
|**pageSize**|Integer|False| |每页显示的数据条数，默认为10，取值范围：10、20、30、50、100|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**slowLogs**|SlowLogDigest[]|慢日志信息|
|**totalCount**|Integer|总记录条数|
### SlowLogDigest
|名称|类型|描述|
|---|---|---|
|**dbName**|String|数据库名，表示该SQL是在哪个数据库中执行的|
|**sql**|String|SQL语句|
|**executionTime**|String|SQL语句执行的开始时间，格式为YYYY-MM-DD hh:mm:ss|
|**executionCount**|Integer|SQL语句的执行次数|
|**elapsedTime**|DigestData|SQL语句执行的时长，单位秒|
|**lockTime**|DigestData|SQL语句等待锁的时间，单位秒|
|**sqlLength**|DigestData|SQL语句的长度|
|**rowsExamined**|DigestData|SQL语句扫描的行数|
|**rowsReturned**|DigestData|SQL语句返回的行数|
### DigestData
|名称|类型|描述|
|---|---|---|
|**pct95**|Float|表示执行结果中95% 数据小于或等于此数值|
|**max**|Float|执行结果的最大值|
|**avg**|Float|执行结果的平均值|
|**min**|Float|执行结果的最小值|
|**total**|Double|执行结果的合计值|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
