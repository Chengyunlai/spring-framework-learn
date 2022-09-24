package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean;

import top.chengyunlai.spring.basic_ioc.annotation.bean.Cat;

import java.util.*;

/**
 * @ClassName
 * @Description 复杂类型注入
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ComplexfieldPerson {
    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String,Object> events;
    private Properties properties;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getTels() {
        return tels;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public Set<Cat> getCats() {
        return cats;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public Map<String, Object> getEvents() {
        return events;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ComplexfieldPerson{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", properties=" + properties +
                '}';
    }
}
