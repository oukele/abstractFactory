package demo2;

public class HuaweiPhone implements Phone {// 手机产品接口的实现类  华为手机
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void close() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void sendOut() {
        System.out.println("使用华为手机发短信");
    }
}
