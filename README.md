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
- Java IDL

组成的一组相关的api，讲道理这里除了反射规范、序列化、文件规范，剩下其他的东西，我也不太清楚，反正就是说一系列规范

而javaBean则是单指其中某一个组件，或者是符合JavaBeans™ API specification规范的java类

所以我先这么理解，要是不对后期再改，JavaBeans指的就是 JavaBeans 规范也就是位于 java.beans 包中的一组 API，其中BeanInfo就是位于java.beans下。
