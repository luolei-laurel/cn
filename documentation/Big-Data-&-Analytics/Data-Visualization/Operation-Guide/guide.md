
#### 1. 登陆京东云
用户使用数据大屏首先需要登陆京东云，进入京东云控制台界面。
 
![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/1.png)
进入京东云点击控制台右侧的数据大屏菜单，系统显示当前用户已经创建的数据大屏列表。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2.png)
用户也可以通过京东云产品也进入数据大屏。
 

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/3.png)
点击立即使用，您就可以访问数据大屏。
 
![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/4.png)

从控制台进入大屏产品后，用户可以查看当前已经发布或正在开发的大屏。在当前页面用户可以对大屏进行创建、预览、发布（取消发布），也可在线编辑包括：复制、删除及重命名。
![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5.png)

#### 2. 我的大屏

##### 2.1 新建空白大屏

用户从右侧列表选择空白屏幕，点击使用大屏，您即可创建一个空白的大屏。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e5f56aea8891862ddb34ca6c39e57be6.png)

##### 2.2 通过模板方式创建大屏

用户选择新建可视化进入选择模板流程，屏幕左侧栏列出了可供用户选择的模板。右侧主显示区是模板的快照。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e0ecd66970638b3c58f02edd938d482.png)


##### 2.3 命名大屏

选择创建大屏的方式后，您还需要命名您的大屏。点击确认后，进入创建大屏工作台。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a0473874d4ade3396b97fd243432162f.png)


##### 2.4 进入编辑大屏的工作台

用户创建大屏后，您将会进入大屏的工作台。工作台分为4个区域：中间为大屏画布区，上测为工具栏，左侧为图层区，右侧为图表/画布配置区。

-   画布区是所有组件的容器，也是您将要创建的数据大屏。

-   工具栏是您选择大屏组件的菜单栏。

-   图层区用于管理画布中的所有组件。

-   图表/画布配置区。您可以在此配置画布的属性以及每一个图表的属性。

###### 2.4.1 画布设置

设置画布即是确定您将要投放大屏的物理设备参数。

点击黑色画布外的空白区域后，右侧配置区将您需要维护的画布属性。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/3c3d13e6e15fdc01f2f861080dac07c6.png)


###### 2.4.2 选择图表组件

您可以通过工具栏选择您需要的图表。目前系统支持的图表类型包括：基础统计累图表、地图、文本指标、交互组件以及辅助图形。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/254f6966808a7620d56be71d2a9cb90d.png)


当您选择某个基础图表后，您可以采用拖拽的方式，在画布上创建这个图表。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e53910025b7dfc7f09ef916f168cca81.png)


###### 2.4.3 图表管理

创建图表后，您即可以在工作台左侧的图层区管理所有组件。您可以调整组件间的图层（上移、下移、置顶、置底下），例如：将大屏背景图置底。您可以调整组件的位置（上对齐、下对齐、左对齐、右对齐、水平居中、垂直居中）。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/fbfeed41c7ea5433f2f9bbcd32cde8df.png)


对于拖入画布中的组件，您还可以通过鼠标右键或者选中组件进行隐藏、复制及删除操作。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/961aa27801b429002cdbe3dfc69ad5da.png)


#### 3 基础图表组件配置

目前大屏提供：折线图、柱图、条形图、饼图、气泡图、散点图、水位图、仪表盘等29个统计类基础图表。

些图表在样式和数据配置上具有相似性。基本上均包括三大类设置：
全局字体及图表位置设置、坐标轴设置（X轴/Y轴/极轴）、数据系列设置及图例设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/d703ad879e5a5b4d939078caecbac8b4.png)


##### 3.1 柱、折、箱线图

柱图、折线图以及箱线图（K线图）都采用直角坐标系。在样式设置上都包括X轴设置、Y轴设置、多系列数据设置及图表上装饰部分的样式设置。在数据绑定上也是通过(X
,Y,S) 三个变量绑定到图表上，其中X表示X轴数值，Y表示Y轴数值，S表示数据系列值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/95906102ac9c00942c9ebbf37994d14e.png)


柱折箱线图属于复合图形，它具备两个Y轴，其中折线和箱线共用一个Y轴。在样式设置和数据设置上都具备代表性，其他图表的样式设置您可以参照柱折箱线图。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e1dd4f6f71b9241e709e72ec04c208cd.png)


###### 3.1.1 柱折箱线图-全局样式

全局样式：全局字体的默认样式、以及基础图表相对于容器边框的位置

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e9056e0fe1d433d6c6245ac437e51397.png)


###### 3.1.2 柱折箱线图-X轴

主要包括：坐标、轴线、刻度线以及网格线的样式设置

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/017a51b20cb537fcacfef98b0960cf85.png)


###### 3.1.3 柱折箱线图-Y折线轴

在K线图是一个双轴图表。其中Y轴(折线)为左侧坐标轴。K线以及折线公用这个坐标轴。Y轴样式设置与X轴线一致,都包括坐标、轴线、刻度线以及网格线的样式设置，此外Y折线轴还允许用户设置最大刻度及最小刻度。用户可以通过修改刻度最值，控制折现与柱图的相对位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e06e3f55c9a4fb64181fbc2cb82c7fa.png)


###### 3.1.4 柱折箱线图-Y柱轴

Y轴(柱图)为右侧坐标轴配置属性与Y折线设置一致。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7fcd785501f0abc39f10063785fc03e4.png)


###### 3.1.5 柱折箱线图-图例

在多系列（多种业务数据）数据展示时，需要使用图例来区分业务。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/85c2e14c7c1b4202da9c41dca5e1d464.png)


###### 3.1.6 柱折箱线图-数据标签

数据标签用于显示图形数值。当用户勾选显示数据标签后，柱图显示业务数据。如下图所示：

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/80a0b7c7302669c047a9766314370716.png)


###### 3.1.7 柱折箱线图-数据系列

数据系列是数据在组件的具体展示内容。用户可以通过添加和删除选项控制图表需要显示的业务数据。

例如：下图中展示了稻谷、小麦、玉米三种业务数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6d9e6aa43693a915cef5d51f97aeccc0.png)


新增数据系列：对于每一个数据系列都可以绑定K线图（箱线）、折现、柱图
三种数据。当用户点击增加数据系列按钮后，系统默认顺序增加一个数据系列的配置项，例如当前图表已经存在3个数据系列后，新增的数据系类值，默认为4。只有当用户配置的数据中存在系列值为4的业务数据时，图表才能显示该业务数据，否则不显示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e2670305307a4cb7f2dfe0ef823ba8c8.png)


数据系列与数据绑定：用户通过与数据一致的系类值，将数据映射到图表中。如果用户设置的系列值与数据不一致，那么图表将不会显示该数据。同理，如果数据没有在系列中维护，那么图表也不会显示该数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2e12b5eace9739124ec8dbb6df0a2d63.png)


图表数据样式设置：用户可以选择是否显示柱图、折线、K线(箱线)，并且对图表的样式细节进行设置，例如：修改柱图的粗细，颜色等。下图为仅显示折线和柱图的效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6ea92259d9375988bffdf0083500dc5.png)


###### 3.1.8 柱折箱线图-图表尺寸和位置

用户可以通过拖拽和缩放的方式控制图表在画布种的大小和位置。用户也可以通过录入数值来精确的改变图表的大小和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/648098390e740aa8ff4c9e519ed6dad8.png)


###### 3.1.9 柱折箱线图-数据源设置

系统支持BDP平台数据计算服务、RDS云数据库，API、Json
4种数据源（在大屏独立部署版本还支持JDBC方式访问本地关系型数据库，如：mysql,postgresql,oracle
及达蒙等）。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2053c7923f6ce31af037268241810562.png)


SQL及API情况下，支持数据定时查询：用户维护数据刷新频率,组件数据自动更新。

数据设置的目的是将图表的属性与数据进行映射。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/632a3e3ab7b0c1970d24e70cfb830a98.png)


##### 3.2 饼图/指标占比图

当您需要指标占比类数据表现时，您可以选择水位图、圆环图、指标图、饼图及仪表盘。这几类图形都存在丰富的图形表现能力，除了数据表现外还叠加了装饰组件。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/c82e0f81d8a4b01d8b87ec841de237f4.png)


###### 3.2.1 水位图

水位图样式设计包括外框装饰及数据区。目前系统支持5种边框。您可以通过修改外边框的形状、颜色、宽度等属性从而达到不同的视觉效果。数据区主要包括文本和水波纹样式设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b3eb0085dbb117aad1f53a7bdcb8cf9e.png)


水位图仅需要您绑定一个变量，系统自动将该值转换为百分比且对末尾进行四舍五入取整。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/bcec775e09ab48672b176c911ef16a2d.png)


###### 3.2.2 百分比条形图

百分比条形图样式设计包括外框装饰、指示线、数据区。您可以在外框样式中修改数据条的颜色及其背景色。指示线用于标记数据，您可以修改每一段线段的长度及线段间的圆滑度。数据系列样式中，您可以为每一条数据设置圆环的内外半径。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2ef2c862b61f41db5fadff435f6234b7.png)


百分比条形图需要您绑定3个变量（X，Y，S），其中X为每一个数据条的业务指标，Y为对应的指标值，S用于您将数据绑定到数据系列中。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a56fdafc32e4ac65fd8351f6540b03dd.png)


###### 3.2.3 指标占比图

指标占比图的样式设计包括外框装饰和数据区。您可以在外框样式中修改颜色宽度以及外框的起止角度。在数据区，您可以修改数据条的颜色以及数据指标的字体、颜色等。在创作大屏过程中您还可以将多个指标占比图拼成圆环图。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/f257135572e0a830d7cc391bb9172402.png)


指标占比图您只需要绑定指标值（Y）。如果您还需要设置业务指标名称，那么您可以在样式中设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/20593e6699f3c0f60e2ae2286095882c.png)


###### 3.2.4 百分比拼图

百分比饼图属于基本饼图，您可以设置数据指标的名称、颜色等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5a45edf69b3d372912db6d2c9d91dc76.png)


百分比饼图的数据绑定需要您设置（X，Y）,其中X为指标名称，Y为指标值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/53b5c35905df5d0eb898ca8e98ef7898.png)


###### 3.2.5 仪表盘

仪表盘是特殊的占比图。它以绝对数值的方式展示数据。在仪表盘样式配置中分为两部分盘面的样式及数据区的设置。其中盘面的设置包括：边框、刻度线、分割线以及指针。数据区的设置主要包括：指标及指标值的字体、颜色、位置等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e22d396a17b256df71aae04c1fb368ff.png)


仪表盘的数据设置包括两个值（name,value），其中name 为指标项，value为指标值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0ab9fc0a7a705ce8616216eca8177ce4.png)


##### 3.3 雷达图

雷达图在样式上支持圆型雷达图和折线雷达图。在样式设置上包括：极轴设置、雷达图样式、数据标签样式及数据系列样式。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4f588fcff74a1611c17a5607f4d66b.png)


在雷达图的极轴中，您可以调节每个轴的最大刻度值。如果您没有维护最大刻度，那么系统将会根据数据的最大值设置轴的最大刻度。此外，您还可以调节轴线的颜色、粗细，刻度值的字体等。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/408da87d1906473454bbbd136c330f3d.png)


雷达图的样式设置主要是对分割线及分割区域的设置。您可以通过调节极轴的刻度数来调节分割线及分割区域的数量。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e0aa47ccb0807a30d0e4b30872997ed4.png)


数据标签和数据系列是业务数据在雷达图上的表现。您可以调整数据区的边线、填充去颜色、标签字段等属性。雷达图也支持多系列数据展示，您可以在数据系列中增加多种业务项。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/44dcf22dbee25f4eae1a90cddeacbae3.png)


您需要绑定数据系列（S）及统计维度，S是您需要描述的数据系列。指标项是数据系列的统计维度。其中S是一个保留字，您必须在绑定的数据中以固定字符S标记。系统在读取数据时，会将S作为业务描述（系列名称），其他列数据作为统计维度。此外，雷达图还支持统计维度重命名功能。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/78840f3dc63fd57d8ca244b05db6aa35.png)


##### 3.4 榜单/列表图

系统提供两种类型的榜单，单指标榜单和多指标榜单。单指标榜单只有序号列和数据列，多指标榜单允许用户添加任意数量的指标。单指标榜单中指标与指标值以折行的方式在一列中显示。多指标榜单每一列表示一种数据指标。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/906db7306fd1a2009ddc95449dde1339.png)


在样式设置中两类榜单均包括：全局样式、边框样式、表头样式设置、行样式设置、序号列样式设置、以及数据列样式设置。

您可以在全局设置中设置榜单的字体、榜单显示行数及滚动动画。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/6449b5918c93f988705b25bf88295478.png)


边框和表头都是可选项，您可以通过显示框来控制。您可以修改外边框的线条颜色、宽度，还可以表头的字体。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/399570c612d154bcdc89cf3736be9158.png)


行配置主要对每一行的背景色、分割线进行配置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/58874c01eb7a0565dace5db51126472f.png)


序号列和数据列配置基本相同，两者都包括列宽和字体的设置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e8bdb72d74e3c330273cc01c9ca5c79.png)


您需要将数据以列表的格式上传。在榜单中列的顺序与您上传的数据一致。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/45bbed7260816cf12128657e1ac01b4c.png)


##### 3.5 日期热力图

日期热力图是在直角坐标系绘制的热力图，其中X/Y轴的数据可以是任意的类目。

热力图样式设置包括：全局设置、X/Y轴及数据区设置。其中全局设置、X/Y轴的配置项与基础图表一致。在数据区设置中，您需要将指标值与组件的颜色进行映射。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/64e68dee5c97efd74f14cbc780995aeb.png)


在热力图数据配置中，您需要为每一个数据块提供(X,Y,VALUE),其中X,Y
轴是业务数据在直角坐标系的位置，Value表示业务数据的热力值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b80eb123dd37b606b8f4e1c66dd7b707.png)


#### 4. 地图组件配置

目前大屏支持：3D边界地图（中国/世界）、2D边界地图（中国/世界）、2D/3D GIS地图
。共6种类型地图。其中边界地图可以下钻到区县级。GIS地图可以到街道界级。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0c852ad8a6c245cb666d8b49ae507f0e.png)


每种地图组件都支持多图层数据叠加，您可以在同一份地图上叠加飞线、3D柱图、气泡，轨迹、热力效果。此外每一种数据展示方式都支持多系列业务数据。例如您可以通过散点图的颜色、形状来表示不同类型的农作物种类。

##### 4.1 3D边界地图（中国/世界）

3D地图类组件配置包括：全局设置、区域设置、数据图层设置（散点、3D柱图、飞线、热力）、光线特效设计、图表尺寸和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/40e68e274f2360952dc2cb32d0c148ef.png)


###### 4.1.1 3D边界地图-全局样式设置

地图类组件的全局设置主要包括：地图区域设置（例如：选择某个省）、默认地图区块颜色，地图中心点、地图缩放等级。在3D是情况下还包括地图的上下倾斜角度和左右旋转角度。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a73e615eaf695e368e5280cb443ba50e.png)


###### 4.1.2 3D边界地图-区域样式设置

您可以对地图的每个区域特别设置颜色等。您即可以通过颜色表示您重点关注的地区，也可以通过配置颜色等达到个性化的视觉效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9556a61274f0b51ff89fcd395c11d457.png)


###### 4.1.3 3D边界地图-散点层样式设置

散点层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以在散点层中设置散点形状，并通过散点类型来区分业务数据。目前系统支持：三角、原型、针形等共7种形状。

在散点层中通过设置文本标注，您可以将数据映射到散点层。您还可以通过JS编程方式自定义您的标注。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/97b637e48005aed910e0ab4547b673a4.png)


###### 4.1.4 3D边界地图-柱图层样式设置

柱图层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以个性化的设置每个数据系列中柱子的形状，包括：粗细、颜色、倒角圆润度。和散点层一样，您可以通过柱子的形状、颜色来表示不同的业务含义。

在柱图层中，您也可以像散点层一样设置文本标注 。

在柱图层中，您还可以开启数据映射功能，一旦开启该功能，您不仅可以通过柱子高度表示数据大小还可以通过颜色来表示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/053ceb938f0ef6a96826443869791d7d.png)


###### 4.1.5 3D边界地图-飞线层样式设置

飞线层支持多系列的数据绑定，数据系列的配置方法与基础图表数据系列配置方式一致。

您可以个性化的设置每个数据系列中飞线的形状，包括：飞线宽度、颜色、飞线尾迹特效。和散点层一样，您可以通过这些属性来表示不同的业务含义。

在飞线层中，您还可开启光线叠加效果，此时叠加的数据越多，飞线亮度越高。

在飞线层中，您仍然可以开启数据映射功能，一旦开启该功能，您可以通过颜色来表示飞线所表示的业务数据。例如：您可以通过颜色来表示北京发往上海的交易量大小。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/dc40454ea737d1eb49d1b2498a9e5aae.png)


###### 4.1.6 3D边界地图-区域热力层样式设置

区域热力仅支持单个数据系列，您可以设置数据与颜色的映射关系。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/859c422b1d040c12b255aa2f4b2d379b.png)


###### 4.1.7 3D边界地图-光线和后期特效叠加

您可以通过光影设置达到更炫酷的展示效果。您可以调节主光源、环境光、高光、景深等特效。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/819b235d2a66db0073409e42b3ac17a4.png)


下图为光源特效的对比图：左测为开启光源的效果，右侧为关闭的效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7555d4bde7e4e9094c40999ae4cab325.png)


###### 4.1.8 3D地图数据设置

地图中每一种数据图层都需要单独绑定数据。系统支持的数据源类型与基础统计图表一致,包括：Json文件、API及关系型数据库。

在散点层的数据绑定时，您需要为每一个数据设置（name,lon,lat.s）4个值。name
用于表示散点的业务名称、lon/lat是数据的经纬度、S用于区分不同的数据系列。其中name
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a7a6407c7424291280ee2cced7413558.png)


在柱图层的数据绑定时，您需要为每一个数据设置（lon,lat,name,value,s）5个值。lon/lat是数据的经纬度、name是业务数据的名称，value用于将柱子的高度映射为业务数值、S用于区分不同的数据系列。其中name
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/1c4cf25008724f938758d8d731345146.png)


在飞线层的数据绑定时，您需要为每一个数据设置（from,to,value,s）4个值。From/to
是飞线的起止点,起止点需要您再通过lon/lat绑定、value用于将飞线的颜色映射为业务数值、S用于区分不同的数据系列。其中value
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b92e40055d47b6411a7af2fc2fd827f3.png)


在热力层的数据绑定时，您需要为每一个数据设置（name,value）2个值。与其他数据图层设置不同，热力层需要您绑定地图区域名称例如北京市、河北省，value用于将飞线的颜色映射为业务数值、S用于区分不同的数据系列。其中value
和S字段为可选字段。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/baedf6313a387eda4b9f335cb99c2169.png)


##### 4.2 2D边界地图（中国/世界）

2D地图类组件配置包括：全局设置、区域设置、数据图层设置（涟漪层、飞线层、区域热力层、点热力层）及图表尺寸和位置。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a6e1777695446b8fd260696755f8dd19.png)


###### 4.2.1 2D边界地图-全局样式设置

2D地图的全局设置用于确认地图的区域（例如某个省份、城市地图）、边界线样式、默认区域颜色及区域标签。此外您还通过拖拽的方式调整地图的大小和位置，也可以通过修改地图中心及地图缩放等级精确调整。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/b6aefc5bc52208c6835b3dbbe536a731.png)


###### 4.2.2  2D边界地图-交互样式设置

交互样式仅当您在交互设置中启动了地图下钻交互才能生效。交互样式用于设置地图区域被选中时的颜色。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ef6e611498ae8920291cc3653df62fcc.png)


###### 4.2.3 2D边界地图-区域样式设置

区域设置用于您个性化设置地图的样式。您可以设置区域的颜色、区域边界的颜色及边界宽度。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/809d9b5d90a235758047737225477720.png)


###### 4.2.4 2D边界地图-涟漪层样式

数据涟漪层具有丰富的表现形式。你可以设置涟漪的形状（例如圆形、方形、三角等共7种）、绘制方式（填充、边线）、涟漪颜色、波纹大小及波纹动画等。下图为通过调整涟漪形状、绘制方式、颜色
属性后的效果。

此外涟漪层支持多系列的数据展示。您可以在同一张地图上展示多个业务指标

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/ec47d4f6fc8d4fe2dc77b605f4d855eb.png)


###### 4.2.5 2D边界地图-飞线层样式

飞线层多用于表示业务数据的流向。您可以调整每一根飞线的起止标、飞线颜色/宽度
及尾迹特效。

数据飞线层也支持多系列的数据展示。您可以在同一张地图上展示多个业务的流向。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/7d5512108b27900872f52c0c39af230f.png)



###### 4.2.6 2D边界地图-区域热力样式

您可以在区域热力层上将地图颜色与业务数据进行映射。区域热力层仅支持单系列的数据展示。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9906bf888b405dad754c76e4860ce6ff.png)



###### 4.2.7 2D边界地图-点热力层样式

您可以在点热力层上将地图颜色与业务数据进行映射。与区域热力层不同，点热力不受限于地图区域边界，仅取决于所绑定数据的经纬度。

在点热力层中，您可以通过调整热力点的模糊半径和热力半径从而更精细的表示业务数据。点热力层支持多单系列的数据展示，您可以通过颜色来区分不同的业务数据。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/32e43dee6505e802eb617335a0b5175b.png)



###### 4.2.8 2D边界地图-数据设置

在涟漪层的数据设置中，您需要设置（lon,lat,value,s,name），其中lon,lat是业务数据的经纬度，value
是业务数据的指标值（例如：100笔订单），Name字段是业务名称标记，S是业务数据类型。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/e5db4d4711f36d9afa4ba448dd4e1bec.png)



在飞线层的数据设置中，您需要设置（from,to,value,s），其中from/to是业务数据流向的起止点（此外您还需要设置起止点经纬度），value
可以用于表示该流向的数据指标（例如：北京发往上海的物流量），S是业务数据类型。S与Value
都为可选值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/db4d904ba8066c13bffb98812c61d91d.png)



在区域热力的数据设置中，您需要设置（name,value,s）,其中name字段是业务数据区域名称（例如：北京市）,value
是业务数据的热度值。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2f2ade52e6dded29812942cf96705d92.png)



在点热力的数据设置，您需要设置为每一个数据的（lon,lat,value,s）,其中lon,lat是业务数据的经纬度,value
是业务数据的热度值，S是业务数据类型。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de424d7616e68c58e66f27bf602afe5c.png)



##### 4.3 2D/3D边界地图-交互设置

2D/3D边界地图均支持下钻，您在交互设置中点击开启按钮，那么预览/发布状态下的地图将会实现下钻功能。此外您还可以个性化设置下钻后地图的中心点、缩放等级。如下示例中：左测为地图下钻前数据大屏，右侧为点击某个区域后的数据大屏。

在2D/3D边界地图下钻事件中，您可以通过点击鼠标逐级下钻地图（最小下钻粒度为区县级）；如果您需要返回上一层，点击地图区域的空白区就可以返回。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/de7fcd3bc3d64c8b12f4ee149ba20b45.png)



![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5f9ab4d2703fe2243a55172d71aadd2f.png)


如果您希望地图下钻后其他图表能随之联动，那么您需要将图表中的区域设置为变量，并将其他图表的SQL与这个变量进行绑定。例如：在下图中，如果您希望地图下钻后右侧折线图数据随之联动。那么您需要在折线图SQL中绑定地图区域变量area。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/37cb4b90956177849834ab00e8f0b24f.png)



#### 5. 文本组件配置

文本类组件包括：文本标题、跑马灯、翻牌器、倒计时器、时间器以及词云组件。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/9127d57469c6bbd684f4e2312fe4634e.png)



##### 5.1 文本框、跑马灯

文本框和跑马灯可以用于数据大屏的标题和新闻滚动条。文本标题不需要绑定数据和交互。您可以在标题名称中直接录入标题。文本标题也支持超链接，您可以通过维护链接地址在当前窗口或者新窗口中打开链接。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/48601001f4c9230ecde99dae595f1fb8.png)



在跑马灯设置中，您除了可以设置字体外还可以设置跑马灯的动画效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/55866aa82734676fff01bfa021242a30.png)



跑马灯的文本需要您通过数据设置绑定。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/bf3180185a50bf629c7bcfc5c1f7d8cf.png)



##### 5.2 时间器、倒计时器

时间器用于显示当前系统时间，此外您还可以自定义一个开始时间。系统将会根据这个时间开始计时。时间器不需要设置数据和交互。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e0a542890ed89b4c3d05dad1b068c13.png)



如果您希望使用倒计时器，那么您需要在数据设置中绑定计时截止时间。数据大屏会根据当前系统时间与截止时间倒计时。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0088db48ae4557d914e5be164698cb30.png)



##### 5.3 数字翻牌器

数字翻牌器是一种重要的数据组件。它同时是一个复合文本组件,包括：标题文本、数值、数值前缀、数值后缀。翻牌器的每一个表示项都可以设置文本的字体、位置。此外，您还可以设置数值的字符间隔、分隔符样式。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/2cd251f561568c40b2fbd763840ff0bd.png)



您可以动态绑定翻牌器的标题文本、数值、数值前缀、数值后缀。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/880a969722b08664054b1bde3e63e8cb.png)



##### 5.4 词云

词云是一种生动的文本表现，通过每个字/词的大小表现权重。您可以调整词的颜色和间隔个性化设置词云。此外，您还可以通过上传轮廓图来修改词云的外观。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/fe9bf84187940b7837a0aee20213f25b.png)



您需要为词云中每一个词绑定名称和权重（name,value）。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/4431ede56bb95d0f59acf6615170f411.png)



#### 6. 交互组件配置

数据大屏中支持页签交互和地图下钻交互。其中地图下钻功能参见上文。

目前系统支持的样式设置包括：默认（没有事件触发时）样式、鼠标悬浮样式、鼠标选中样式。您需要为每一个鼠标状态分别设置页签字体颜色、背景色。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/20dc29e9197ca283bbd154eff9502660.png)



您需要为每一个页签创建一条数据。参见下图。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5686ffb8b1ee8d7032eab2f15aa0771c.png)



TAB页签作为交互操作的控制器，页签在捕获鼠标事件后，需要您首先创建一个变量才能将TAB页签的值传递到其它组件。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5686ffb8b1ee8d7032eab2f15aa0771c.png)



在下图所示的数据大屏中，TAB页签用于切换地图数据图层的切换。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/85e3780f977367476abf68c735522bd5.png)



涟漪层数据绑定如下：

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/c8dd4400d56aacddd50dfd5a958c1aa2.png)



点热力层的数据绑定如下：

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/8af3db9b22072f4a4e4057109266a29b.png)



下图为TAB页签切换地图数据图层的效果。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/01b4f7cc706ef95c4003802addcbf61b.png)



#### 7. 辅助组件配置

辅助组件主要包括：图片上传、gif动图上传、视频流展示。目前系统内置了20余种装饰组件。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5ac9b8eab2e7f2839118230f2ff0644e.png)



#### 8. 大屏预览/发布

在大屏的操作台中您可以通过点击右上角的预览/发布按钮查看大屏。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/a082f3f48a15c524e600aabe3a5979a5.png)



当您点击了发布按钮后，系统会弹出发布配置页面。在这个页面，您可以维护加密密码。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5e248bfd8c7d9b5fb6b164fe0361579e.png)



对于已经发布的大屏，您可以通过URL分享大屏。在加密分享分情况下，用户需要录入密码才能查看数据大屏。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/5d7be174b947d1d73e816ff2793b211f.png)



用户录入密码后，即可全屏查看数据大屏。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/4ffadbaf3dba6f9002dfa514fc98aae8.png)



#### 9. 数据源管理

您可以在数据源管理处查看、新增、删除和修改数据源。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/f57a15706b79cab74ad441ed0aa2fd03.png)



如果该数据源已经被某个大屏引用。那么系统禁止用户删除该数据源。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/0bd7ec1166749d4fcf633a534687b119.png)



您还可以通过点击查询，预览数据源内数据表。

![](https://github.com/jdcloudcom/cn/blob/edit/image/Data-Visualization/media/aa4f013eaaf45f42dc1f354b1b213201.png)



