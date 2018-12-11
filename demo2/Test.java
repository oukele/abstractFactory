package demo2;

public class Test {

    public static void main(String[] args) {
        System.out.println("=========================小米系列产品=========================");
        //小米工厂实例
        ProductFactory xiaofactory = new XiaomiFactory();
        //小米手机
        Phone xiaoPhone = xiaofactory.productPhone();
        xiaoPhone.start();
        xiaoPhone.sendOut();
        xiaoPhone.close();
        //小米路由器
        Router xiaoRouter = xiaofactory.productRouter();
        xiaoRouter.start();
        xiaoRouter.wifi();
        xiaoRouter.close();

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("=========================华为系列产品=========================");
        //华为工厂实例
        ProductFactory huaweifactory = new HuaweiFactory();
        //华为手机
        Phone huaweiPhone = huaweifactory.productPhone();
        huaweiPhone.start();
        huaweiPhone.sendOut();
        huaweiPhone.close();
        //华为路由器
        Router huaweiRouter= huaweifactory.productRouter();
        huaweiRouter.start();
        huaweiRouter.wifi();
        huaweiRouter.close();

    }
}
