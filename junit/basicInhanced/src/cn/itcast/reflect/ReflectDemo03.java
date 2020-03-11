package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {

    /**
     * 2. 获取构造方法们
     * 			* Constructor<?>[] getConstructors()
     * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
     *
     * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * 			* Constructor<?>[] getDeclaredConstructors()
     * @param args
     */
    public static void main(String[] args) throws Exception {

        Class<Person> pc = Person.class;

        Constructor[] constructors = pc.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("--------");
        Constructor constructor = pc.getConstructor(String.class, int.class);
        System.out.println(constructor);
        // 创建对象，通过newInstance来创建对象实例
        Object tom = constructor.newInstance("Tom", 18);
        System.out.println(tom);
        System.out.println("---------");
        // 空参的简便构造方法，Class对象的newInstance方法的对象实例化
        Person person = pc.newInstance();
        System.out.println(person);
        System.out.println("--------");
        Constructor<?>[] declaredConstructors = pc.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {

            System.out.println(declaredConstructor);
        }
    }
}
