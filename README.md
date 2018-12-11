###抽象工厂

####定义：抽象工厂模式提供了一个创建一系列相关或者相互依赖对象的接口，无需指定它们具体的类。

~~~
为了能更好理解抽象工厂模式，举个例子：

手机有小米手机、华为手机、苹果手机....，这些具体的手机和抽象手机就构成了一个产品等级结构。

同样的，路由器有小米路由器，华为路由器，这些具体的路由器和抽象路由器就构成了另一个产品等级结构，实质

上 产品等级结构即产品的继承结构（相当于实现了同一个接口的实现类）。 小米手机位于手机产品等级结构中，小米路由器位于路由器的产品等级结构中

，而小米手机和小米路由器都是小米公司生产的，这样就构成了一个产品族，同理华为手机和华为路由器也构成了一个产品族。
~~~
#####重点：产品族中的产品都是由同一个工厂生产的，位于不同的产品等级结构。
#####抽象工厂是针对产品族。