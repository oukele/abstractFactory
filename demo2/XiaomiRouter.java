package demo2;

public class XiaomiRouter implements Router {// 路由器产品接口的实现类  小米路由器
    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void close() {
        System.out.println("开闭小米路由器");
    }

    @Override
    public void wifi() {
        System.out.println("打开小米路由器的wifi功能");
    }

}
