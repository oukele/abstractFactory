package demo2;

public class HuaweiRouter implements Router { // 路由产品接口的实现类  华为路由器
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void close() {
        System.out.println("开闭华为路由器");
    }

    @Override
    public void wifi() {
        System.out.println("打开华为路由器的wifi功能");
    }
}
