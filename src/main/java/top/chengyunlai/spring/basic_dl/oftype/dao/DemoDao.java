package top.chengyunlai.spring.basic_dl.oftype.dao;

public interface DemoDao {
    /**
     * 试想，如果一个接口有多个实现，而咱又想一次性把这些都拿出来，
     * 那 getBean 方法显然就不够用了，需要使用额外的方式。
     */
    public String findAll();
}
