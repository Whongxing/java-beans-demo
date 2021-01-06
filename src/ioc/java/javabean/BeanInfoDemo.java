package ioc.java.javabean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

/**
 * BeanInfo示例
 * BeanInfo是JavaBeans里的一个api,用于管理Bean的元信息
 * @author wanghx
 */
public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        //处理一下,自省异常
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
    }
}
