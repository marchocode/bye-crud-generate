## bye-crud-generate

告别CRUD！代码一键生成器。

### 初衷

其实我们的初衷很简单，使用模板生成器的方式。让广大和我一样、初出茅庐的程序猿朋友。更多的能将自身定位在  **业务的开发** 当中，而不是年复一年的写着重复的东西。这样的日子未免太过于单调和乏味！

### 技术栈

- Springboot
- Mybatis-Plus

### 项目特点

- Restful 接口风格
- 

### 生成模板

> 后端代码，采用Springboot+mybatis-plus 的方式实现最基本的逻辑构造。
>
> 选取Mybatis-plus 原因很简单。Mybatis-plus 对这种单表的增删改查非常的友好，基本上无需建立xml。
>
> 继承Mybatis-plus 默认的 `BaseMapper` 即可让你的 `mapper` 拥有最基本的 `CRUD`  

- controller
  - ApiController.java
- service
  - impl
    - ApiServiceImpl.java
  - ApiService.java
- model
  - Model.java
- pojo
  - ModelSaveAO.java
  - ModelPageAO.java
- mapper
  - ApiMapper.java



> 前端的话，还是采取前后端分离的形式。
>
> 基本上现在Vue + ElementUI 这种形式也非常的普遍。我们选择这种方式进行生成。
>
> 最大化的让生成的代码文件不加任何修改即可运行！

- 正在进行~

### 当前进度

1. 初始化搭建项目~
2. 建立页面交互~
3. 实现接口生成逻辑~ 【TODO】