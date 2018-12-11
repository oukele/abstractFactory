package demo2;

public interface ProductFactory {//抽象产品工厂接口

    /**
     * 生产手机
     * */
    Phone productPhone();

    /**
     * 生产路由器
     * */
    Router productRouter();

}
