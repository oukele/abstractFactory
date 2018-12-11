package demo2;

public class HuaweiFactory implements ProductFactory {// 抽象工厂接口的实现类 -->  华为工厂类
    @Override
    public Phone productPhone() {
        System.out.println("-----------------------生产华为手机-----------------------");
        return new HuaweiPhone();
    }

    @Override
    public Router productRouter() {
        System.out.println("-----------------------生产华为路由器-----------------------");
        return new HuaweiRouter();
    }
}
