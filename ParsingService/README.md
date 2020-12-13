# ParsingService

SQL解析服务，提供SQL语法解析能力。

## 服务结构

## 接口定义

### Parse

#### 请求

ParseRequest

| 参数名称   | 参数类型         | 是否必选 | 参数说明                |
|:----------|:---------------|:-------|:-----------------------|
| sqlString | String(0-2048) | Y      | SQL语句字符串            |
| dbType    | String(0-32)   | Y      | 数据库类型，当前支持mysql |

#### 响应

Response

| 参数名称    | 参数类型        | 是否必选 | 参数说明    |
|:-----------|:--------------|:-------|:-----------|
| resultCode | String(1-16)  | Y      | 返回结果码   |
| resultDesc | String(1-128) | Y      | 返回结果说明 |
| result     | ParseResponse | N      | SQL解析结果  |

ParseResponse

| 参数名称    | 参数类型                       | 是否必选 | 参数说明                |
|:-----------|:-----------------------------|:-------|:-----------------------|
| features   | String(0-2048)               | Y      | SQL语句字符串            |
| dbType     | String(0-32)                 | Y      | 数据库类型，当前支持mysql |
| columnList | Collection<TableStat.Column> | N      |                        |

## 日志

