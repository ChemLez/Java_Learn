package cn.itcast.reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Ref;
import java.util.Properties;

public class ReflectDemo05 {

    /**
     * 反射案例
     */

    public static void main(String[] args) throws Exception {

        // 1.加载配置文件
        // 1.1创建properties对象

        Properties pro = new Properties();
        // getClassLoader将类（ReflectDemo05)字节码文件加载进内存
        ClassLoader classLoader = ReflectDemo05.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        // 2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 3.加载该类进内存
        Class aClass = Class.forName(className);

        // 当类加载进内存后，即可对类进行实例化操作，即对创建对象,Class.newInstance()
        // 4.创建对象
        Object obj = aClass.newInstance();
        // 5.获取方法对象
        Method method = aClass.getMethod(methodName);
        // 6.执行方法
        method.invoke(obj);



    }
}
