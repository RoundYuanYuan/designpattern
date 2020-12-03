# 设计模式
## 一、基础概念
### 1.1 设计模式六大原则
- 单一职责原则
- 里氏替换原则
第一种定义，也是最正宗的定义：If for each object o1 of type S there is anobject o2 of type T such that for all programs P defined in terms of T,thebehavior of P is unchanged when o1 is substituted for o2 then S is asubtype of T.（如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。）
第二种定义：Functions that use pointers or references to base classes mustbe able to use objects of derived classes without knowing it.（所有引用基类的地方必须能透明地使用其子类的对象。）
- 依赖倒置原则
高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
- 接口隔离原则
- 迪米特法则
迪米特法则（Law of Demeter，LoD）也称为最少知识原则（Least KnowledgePrinciple，LKP），虽然名字不同，但描述的是同一个规则：一个对象应该对其他对象有最少的了解。通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，你（被耦合或调用的类）的内部是如何复杂都和我没关系，那是你的事情，我就知道你提供的这么多public方法，我就调用这么多，其他的我一概不关心。
- 开闭原则
软件实体应该对扩展开放，对修改关闭，其含义是说一个软件实体应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化。那什么又是软件实体呢？软件实体包括以下几个部分：
项目或软件产品中按照一定的逻辑规则划分的模块。
抽象和类。
方法。
### 1.2 设计模式
#### 1.2.1 单例模式
懒汉式
饿汉式
变体：n例模式
#### 1.2.2 工厂方法模式
