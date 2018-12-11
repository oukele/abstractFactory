package demo2;

public class XiaomiPhone implements Phone {// 手机产品接口的实现类  小米手机
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void close() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void sendOut() {
        System.out.println("使用小米手机发短信");
    }
}
