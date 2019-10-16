# testInvoke


## 描述
控制台测试执行函数

## 请求方式
POST

## 请求地址
https://function.jdcloud-api.com/v1/regions/{regionId}/testinvoke

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**event**|String|True| |执行函数的输入事件|
|**functionName**|String|True| |函数名称|
|**versionName**|String|True| |版本名称|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|本次请求Id|
|**result**|Result|本次测试执行函数的结果|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|FunctionInvokeResult| |
### FunctionInvokeResult
|名称|类型|描述|
|---|---|---|
|**billingTime**|Number|函数收费时间|
|**codeCheckSum**|String|代码包校验和|
|**invokeTime**|Float|函数执行时间|
|**logStr**|String|函数执行日志|
|**realMem**|Float|函数实际使用内存大小|
|**result**|String|函数执行结果|
|**setupMem**|Number|函数设置内存大小|

## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
|**404**|NOT_FOUND|
