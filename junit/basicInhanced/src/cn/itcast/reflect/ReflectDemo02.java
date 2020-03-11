package cn.itcast.reflect;

import cn.itcast.domain.Person;
import com.sun.tools.corba.se.idl.StructEntry;

import java.lang.reflect.Field;

public class ReflectDemo02 {

    /**
     * Class对象功能的使用
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
        Field[] fields = pc.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("----");

        Field name = pc.getField("salary");
        System.out.println(name);
        Person person = new Person();
        name.set(person, 1000);
        String name1 = name.getName();
        System.out.println(name1);
        System.out.println(person.getSalary());

        System.out.println("----");

        Field[] declaredFields = pc.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name2 = pc.getDeclaredField("name");
        name2.setAccessible(true);
        name2.set(person,"Tom");
        System.out.println(person.getName());
        System.out.println("==============");

    }


}
