package top.chengyunlai.spring.bean.a_type.factorybean.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Child {
    // 当前的小孩子想玩球
    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }

    @Override
    public String toString() {
        return "Child{" + "wantToy='" + wantToy + '\'' + '}';
    }
}
