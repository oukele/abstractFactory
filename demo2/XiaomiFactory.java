package demo2;

public class XiaomiFactory implements ProductFactory {// 抽象工厂接口的实现类 -->  小米工厂类
    @Override
    public Phone productPhone() {
        System.out.println("-----------------------生产小米手机-----------------------");
        return new XiaomiPhone();
    }

    @Override
    public Router productRouter() {
        System.out.println("-----------------------生产小米路由器-----------------------");
        return new XiaomiRouter();
    }
}
