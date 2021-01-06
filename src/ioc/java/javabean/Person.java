package ioc.java.javabean;

/**
 * pojo类
 * set,get方法
 * javabeans通过可写（Writeable）可读(readable)去描述这两个方法
 * @author wanghx
 */
public class Person {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
