# java-beans-demo
IOC容器的实现JavaBens中BenaInfo的测试案例
# 一、什么是JavaBeans？
最近看小马哥的Spring的时候JavaBeans和JavaBean把我搞蒙了,到底什么是Javabeans呢？

搜啊搜，搜啊搜，看到这么一句话说 sun出过一个Sun Microsystems JavaBeans™，描述了JavaBeans™ API specification(翻译：javaBeans  API   规范)

所以单纯说到javabeans，指的由
- The Java Core Reflection API （java核心反射API）
- Java Object Serialization (java对象序列化)
- JDK 1.1 AWT Enhancements （JDK 1.1 AWT增强）
- JAR file specification （JAR文件规范）
- Remote Method Invocation （远程方法调用）
- Java IDL组成的一组相关的api

讲道理这里除了反射规范、序列化、文件规范，剩下其他的东西，我也不太清楚，反正就是说一系列规范

而javaBean则是单指其中某一个组件，或者是符合JavaBeans™ API specification规范的java类

所以我先这么理解，要是不对后期再改，JavaBeans指的就是 JavaBeans 规范也就是位于 java.beans 包中的一组 API，其中BeanInfo就是位于java.beans下。
# 二、操作一下BeanInfo
##### 首先获取一个BeanInfo
```
    public static void main(String[] args) throws IntrospectionException {
        //处理一下,自省异常,这里throws
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
    }
```
##### 跟踪一下BeanInfo类,测试一下Person.class的PropertyDescriptor
```
public interface BeanInfo {
    //Bean的一些基本信息
    BeanDescriptor getBeanDescriptor();
    //事件上的描述
    EventSetDescriptor[] getEventSetDescriptors();
    int getDefaultEventIndex();
    //写方法，读方法
    PropertyDescriptor[] getPropertyDescriptors();
    int getDefaultPropertyIndex();
    MethodDescriptor[] getMethodDescriptors();
    BeanInfo[] getAdditionalBeanInfo();
    Image getIcon(int iconKind);
}

```
可以看一下，下面测试代码通过遍历propertyDescriptor，我们来看看BeanInfo中的PropertyDescriptor[]里面到底是什么
![](https://github.com/Whongxing/java-beans-demo/blob/master/src/image/%E9%81%8D%E5%8E%86%E4%B8%80%E4%B8%8B%E4%B8%80%E4%B8%AA%E7%B1%BB%E7%9A%84propertyDescriptors.PNG)
结果图
![](https://github.com/Whongxing/java-beans-demo/blob/master/src/image/%E4%BF%9D%E5%AD%98propertyDescr%E7%9A%84%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.PNG)
