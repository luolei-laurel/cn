# createFunction


## 描述
创建函数

## 请求方式
POST

## 请求地址
https://function.jdcloud-api.com/v1/regions/{regionId}/functions

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**code**|Code|True| |函数代码包|
|**description**|String|False| |函数描述信息|
|**entrance**|String|True| |函数入口，格式为入口文件.入口函数名|
|**environment**|Env|False| |函数运行时环境变量|
|**logSetId**|String|False| |函数指定的日志集Id|
|**logTopicId**|String|False| |函数指定的日志主题Id|
|**memory**|Integer|True| |函数运行最大内存|
|**name**|String|True| |函数名称|
|**overTime**|Integer|True| |函数运行超时时间|
|**runTime**|String|True| |函数运行环境|
|**subnetId**|String|False| |函数配置的子网Id|
|**version**|String|False| |函数版本，默认为LATEST|
|**vpcId**|String|False| |函数配置的VPCId|

### Code
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**bucketName**|String|False| |代码所在对象存储的bucket名称|
|**objectName**|String|False| |代码所在对象存储的object名称|
|**onlineCode**|String|False| |在线编辑代码|
|**zipFile**|String|False| |代码压缩文件，base64编码|
### Env
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**data**|Object|False| | |

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|本次请求Id|
|**result**|Result|创建函数返回值|

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Function| |
### Function
|名称|类型|描述|
|---|---|---|
|**code**|Code|函数代码|
|**codeCheckSum**|String|代码包校验和|
|**codeSize**|Integer|代码包大小，单位为字节|
|**createTime**|String|函数创建时间|
|**description**|String|函数描述|
|**downloadUrl**|String|代码包下载的url地址|
|**entrance**|String|函数入口，格式为入口文件.入口函数名|
|**environment**|Env|函数环境变量|
|**functionId**|String|函数Id|
|**logSetId**|String|函数指定的日志集id|
|**logTopicId**|String|函数指定的日志主题id|
|**memory**|Integer|函数运行最大内存|
|**name**|String|函数名称|
|**overTime**|Integer|函数超时时间|
|**runTime**|String|函数运行环境，目前有python3.6|
|**subnetId**|String|函数配置的子网id|
|**updateTime**|String|函数最后更新时间|
|**version**|String|函数版本名称|
|**vpcId**|String|函数配置的VPCid|
### Code
|名称|类型|描述|
|---|---|---|
|**bucketName**|String|代码所在对象存储的bucket名称|
|**objectName**|String|代码所在对象存储的object名称|
|**onlineCode**|String|在线编辑代码|
|**zipFile**|String|代码压缩文件，base64编码|
### Env
|名称|类型|描述|
|---|---|---|
|**data**|Object| |

## 返回码
|返回码|描述|
|---|---|
|**200**|A successful response.|
