package cn.itcast.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@AnnPro(className = "cn.itcast.domain.Person", methodName = "eat")
public class AnnotationReflect {

    /**
     * 通过注解的方式达到省去配置文件反射框架的作用
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        // 1.解析注解
        // 1.1获取该类的字节码文件
        Class<AnnotationReflect> annotationReflectClass = AnnotationReflect.class;
        // 2.获取该类指定类型的注解
        // 生成了一个该注解接口子类的对象
        AnnPro annotation = annotationReflectClass.getAnnotation(AnnPro.class);

        // 3.调用注解对象中定义的返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);

        // 4.加载该类进内存
        Class aClass = Class.forName(className);
        System.out.println(aClass);
        // 5.将类进行实例化操作
        Object person = aClass.newInstance();
        System.out.println(person);
        Method method = aClass.getMethod(methodName,String.class);
        System.out.println(method);
        method.invoke(person,"food");


    }
}
