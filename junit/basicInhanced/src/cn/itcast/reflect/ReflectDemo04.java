package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo04 {

    public static void main(String[] args) throws Exception {
        /**
         * 3. 获取成员方法们：
         * 			* Method[] getMethods()
         * 			* Method getMethod(String name, 类<?>... parameterTypes)
         *
         * 			* Method[] getDeclaredMethods()
         * 			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        Class pc = Person.class;
        Method eat = pc.getMethod("eat");
        // 执行方法采用invoke方法，先创建实例对象invoke(object,args)
        Person person = new Person();
        eat.invoke(person);
        System.out.println("------");
        Method eat1 = pc.getMethod("eat", String.class);
        eat1.invoke(person, "rice");
        System.out.println("----");
        Method[] methods = pc.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName()); //获取方法名
        }

        System.out.println("------");

        System.out.println(pc.getName());//获取类名
        System.out.println("--------");
        System.out.println(pc.getClass().getName());
    }
}
