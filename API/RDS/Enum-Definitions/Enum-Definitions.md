# 枚举类型定义

- engine RDS引擎类型
- engineVersion RDS引擎版本
- instanceStatus 实例状态
- dbStatus 数据库状态
- accountStatus 账号状态
- privilege 数据库访问权限
- characterSetName 数据库字符集
- sqlAuditStatus 数据审计状态
- connectionMode 访问模式
- backupStatus 备份状态
- backupType 备份类型
- backupMode 备份模式
- backupUnit 备份粒度
- instanceClass 实例规格
- parameterGroupStatus 参数组状态
- parameterStatus 参数状态
- instanceType 实例类型
- instanceStorageType 存储类型

## engine RDS引擎类型

|取值|说明|
|-|-|
|MySQL|MySQL数据库引擎|
|MariaDB|MariaDB数据库引擎|
|Percona|Percona数据库引擎|
|SQL Server|SQL Server数据库引擎，注意中间有空格|
|PostgreSQL|PostgreSQL数据库引擎|

## engineVersion RDS引擎版本

|取值|说明|
|-|-|
|5.6|MySQL 5.6 版本|
|5.7|MySQL 5.7 版本|
|5.7|Percona 5.7 版本|
|10.2|MariaDB 10.2 版本|
|2008R2 EE|SQL Server 2008R2 企业版|
|2012 EE|SQL Server 2012 企业版|
|2014 EE|SQL Server 2014 企业版|
|2016 EE|SQL Server 2016 企业版|
|2012 SE|SQL Server 2012 标准版|
|2014 SE|SQL Server 2014 标准版|
|2016 SE|SQL Server 2016 标准版|
|2012 Web|SQL Server 2012 Web版|
|2014 Web|SQL Server 2014 Web版|
|2016 Web|SQL Server 2016 Web版|
|10.5|PostgreSQL 10.5版本|

## instanceStatus 实例状态

|取值|说明|
|-|-|
|BUILDING|创建中|
|RUNNING|运行|
|BUILD_ERROR|创建错误|
|DELETED|已删除|
|DELETING|删除中|
|DELETE_ERROR|删除错误|
|FAILOVER|主备切换中|
|FAILOVER_ERROR|主备切换错误|
|RESTORING|本地覆盖恢复中|
|RESTORE_ERROR|本地覆盖恢复错误|
|DB_RESTORING|单库上云/单库备份恢复中|
|DB_RESTOR_ERROR|单库上云/单库备份恢复失败|
|MIGRATING|迁移中|
|MIGRATE_ERROR|迁移错误|
|GROWING_CLUSTER|增加实例中|
|SHRINKING_CLUSTER|减少实例中|
|REBOOTING|重启中|
|REBOOT_ERROR|重启错误|

## dbStatus 数据库状态

|取值|说明|
|-|-|
|BUILDING|创建中|
|RUNNING|运行|
|DELETING|删除中|
|DELETE_ERROR|删除错误|
|ERROR|异常|

## accountStatus 账号状态

|取值|说明|
|-|-|
|BUILDING|创建中|
|RUNNING|运行|
|DELETING|删除中|
|DELETE_ERROR|删除错误|
|ERROR|异常|

## privilege 数据库访问权限

|取值|说明|
|-|-|
|ro|只读|
|rw|读写|

## characterSetName 数据库字符集

|取值|说明|
|-|-|
|utf8|MySQL, Percona, MariaDB字符集|
|gbk|MySQL, Percona, MariaDB字符集|
|latin1|MySQL, Percona, MariaDB字符集|
|utf8mb4|MySQL, Percona, MariaDB字符集|
|Chinese_PRC_CI_AS|SQL Server字符集|
|Chinese_PRC_CS_AS|SQL Server字符集|
|SQL_Latin1_General_CP1_CI_AS|SQL Server字符集|
|SQL_Latin1_General_CP1_CS_AS|SQL Server字符集|
|Chinese_PRC_BIN|SQL Server字符集|

## sqlAuditStatus 数据审计状态

|取值|说明|
|-|-|
|off|关闭（默认）|
|on|开启|

## connectionMode 访问模式

|取值|说明|
|-|-|
|standard|标准访问模式(默认)|
|security|高安全访问模式|

## backupStatus 备份状态

|取值|说明|
|-|-|
|COMPLETED|备份成功|
|ERROR|备份错误|
|BUILDING|备份中|
|DELETING|删除中|
|DELETE_ERROR|删除错误|
|RETAINED|实例删除，备份保留|

## backupType 备份类型

|取值|说明|
|-|-|
|full|全量备份|
|diff|增量备份|

## backupMode 备份模式

|取值|说明|
|-|-|
|auto|系统自动备份|
|manual|手动备份|

## backupUnit 备份粒度

|取值|说明|
|-|-|
|instance|实例备份|
|database|数据库备份|

## instanceClass  实例规格
- SQL Server

|   instanceClass   |   CPU(核) |   内存(GB)    |   磁盘(GB)    |
|   -   |   -   |   -   |   -   |
|   db.sqlsvr.s1.large  |   2   |   8   |   200 |
|       |   2   |   8   |   300 |
|       |   2   |   8   |   400 |
|       |   2   |   8   |   500 |
|   db.sqlsvr.s1.xlarge |   4   |   16  |   400 |
|       |   4   |   16  |   500 |
|       |   4   |   16  |   600 |
|       |   4   |   16  |   800 |
|   db.sqlsvr.s1.2xlarge    |   8   |   32  |   600 |
|       |   8   |   32  |   800 |
|       |   8   |   32  |   1000    |
|       |   8   |   32  |   1200    |
|   db.sqlsvr.s1.4xlarge    |   16  |   64  |   1000    |
|       |   16  |   64  |   12000   |   |

- MySQL

|   instanceClass   |   CPU(核) |   内存(GB)    |   磁盘(GB)    |
|   --- |   --- |   --- |   --- |
|   db.mysql.s1.micro   |   1   |   1   |   20  |
|       |   1   |   1   |   40  |
|       |   1   |   1   |   60  |
|       |   1   |   1   |   80  |
|       |   1   |   1   |   100 |
|   db.mysql.s1.small   |   1   |   2   |   60  |
|       |   1   |   2   |   80  |
|       |   1   |   2   |   100 |
|       |   1   |   2   |   120 |
|       |   1   |   2   |   150 |
|   db.mysql.s1.medium  |   1   |   4   |   100 |
|       |   1   |   4   |   120 |
|       |   1   |   4   |   150 |
|       |   1   |   4   |   200 |
|       |   1   |   4   |   300 |
|   db.mysql.s1.large   |   2   |   8   |   200 |
|       |   2   |   8   |   250 |
|       |   2   |   8   |   300 |
|       |   2   |   8   |   400 |
|       |   2   |   8   |   500 |
|   db.mysql.s1.xlarge  |   4   |   16  |   400 |
|       |   4   |   16  |   500 |
|       |   4   |   16  |   600 |
|       |   4   |   16  |   800 |
|       |   4   |   16  |   1000    |
|   db.mysql.s1.2xlarge |   8   |   32  |   600 |
|       |   8   |   32  |   800 |
|       |   8   |   32  |   1000    |
|       |   8   |   32  |   1200    |
|       |   8   |   32  |   1600    |
|   db.mysql.s1.4xlarge |   16  |   64  |   1000    |
|       |   16  |   64  |   1200    |
|       |   16  |   64  |   1600    |
|       |   16  |   64  |   2000    |

## parameterStatus 参数状态 
|取值|说明|
|-|-|
|VALID|生效|
|SYNCING|同步中|
|PENDING_REBOOT|待重启|

## parameterGroupStatus 参数组状态 
|取值|说明|
|-|-|
|AVAILABLE|可用|
|SYNCING|同步中|

## instanceType 实例类型 
|取值|说明|
|-|-|
|standalone|单实例|
|cluster|主备实例|
|readonly|只读实例|

## instanceStorageType 存储类型 
|取值|说明|
|-|-|
|LOCAL_SSD|本地SSD|
|EBS_SSD|SSD云盘|

