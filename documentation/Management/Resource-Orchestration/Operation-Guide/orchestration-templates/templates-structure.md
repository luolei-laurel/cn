# 编排模板

## 编排模板结构说明

　　模板是一个 JSON 格式的文本文件，使用 UTF8 编码。模板用于创建资源栈，是描述基础设施和架构的蓝图。模板编辑者在模板中定义资源和配置细节，并说明资源间的依赖关系。

### JSON
下面的示例显示 JSON 格式的模板片段。

```
{
  "JDCLOUDTemplateFormatVersion" : "2018-10-01",

  "Description" : "模板描述信息，可用于说明模板的适用场景、架构说明等。",

  "Parameters" : {
      // 定义创建资源栈时，用户可以定制化的参数。
  },

  "Mappings" : {
      // 定义映射信息表，映射信息是一种多层的 Map 结构。
  },

  "Conditions" : {
      // 使用内部条件函数定义条件。这些条件确定何时创建关联的资源。
  },

  "Resources" : {
      // 所需资源的详细定义，包括资源间的依赖关系、配置细节等。
  },

  "Outputs" : {
      // 用于输出一些资源属性等有用信息。可以通过 API 或控制台获取输出的内容。
  }
}
```

### 模板部分
　　模板包含几个主要部分。Format Version 部分是必需部分。模板中的某些部分可以任何顺序显示。但是，在您构建模板时，使用以下列表的逻辑顺序可能会很有用，因为一个部分中的值可能会引用上一个部分中的值。列表简要概述了每个部分。

#### Format Version（必选）
　　资源编排支持的模板版本号，当前版本号：2018-10-01

#### Description（可选）
　　一个描述模板的文本字符串，对模板进行详细描述。

#### Parameters（可选）
　　定义创建资源栈时，模板用户可以定制化的参数。在运行时 (创建或更新堆栈时) 传递到模板。您可在模板的 Resources 和 Outputs 部分中引用定义的这些参数。使用参数可以增强模板的灵活性，提高复用性。

　　更多详细信息，请参见 [参数（Parameters）](templates-grammar-Parameters.md)。

#### Mappings（可选）
　　可用来指定条件参数值的密钥和关键值的映射，与查找表类似。您可通过使用 Resources 和 Outputs 部分中的 Fn::FindInMap 内部函数将键与相应的值匹配。

　　更多详细信息，请参见 [映射（Mappings）](templates-grammar-Mappings.md)。

#### Conditions（可选）
　　Conditions 使用 Fn::And、Fn::Or、Fn::Not、Fn::Equals 等定义条件。在创建或更新资源栈时，系统先计算模板中的所有条件，然后再创建资源。创建与 true 条件关联的所有资源，忽略与 false 条件关联的所有资源。

　　更多详细信息，请参见 [条件（Conditions）](templates-grammar-Conditions.md)。

#### Resources（可选）
　　用于详细定义使用该模板创建的资源栈所包含的资源，包括资源间的依赖关系、配置细节等。

　　更多详细信息，请参见 [资源（Resources）](templates-grammar-Resources.md)。

#### Outputs（可选）
　　用于输出一些资源属性等有用信息。可以通过 API 或控制台获取输出的内容。

　　更多详细信息，请参见 [输出（Outputs）](templates-grammar-Outputs.md)。

