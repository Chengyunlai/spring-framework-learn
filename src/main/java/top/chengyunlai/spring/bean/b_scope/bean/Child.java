package top.chengyunlai.spring.bean.b_scope.bean;


/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Child {
    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }

    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
