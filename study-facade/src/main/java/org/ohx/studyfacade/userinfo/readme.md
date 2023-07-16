传统方法将每个类都直接暴露给使用者，存在一下问题。

1. 使用者需要清晰地掌握用户资料管理模块内部的每个子类的分工和职责，一旦子类发生变更，则使用者类需要跟着变更。
2. 随着使用者越来越多，用户资料管理模块和外部的交互变得越来越复杂，后期难以维护和扩展

Facade模块可以针对不同的接口采取不同的处理方式

1. 转发
   Facade模式收到外部模块的请求后，直接转发给对应的内部模块处理，然后将内部模块的处理结果返回。
2. 组合
   Facade模块收到外部模块的请求后，请求多个内部模块处理，最后将多个内部模块的处理结果组合起来返回给外部模块。