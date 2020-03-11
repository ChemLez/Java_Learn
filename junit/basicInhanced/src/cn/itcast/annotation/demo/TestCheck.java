package cn.itcast.annotation.demo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后，会自动自行被检测的方法(@Check注解）
 * 判断是否有异常，并将异常记录在文件中
 */
public class TestCheck {

    public static void main(String[] args) throws IOException {

        Calculator cal = new Calculator();
        Class aClass = cal.getClass();
        Method[] methods = aClass.getMethods();
        int number = 0; // 用于记录异常出现的次数

        // 创建字符流对象，将异常信息写入到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) { // 遍历该类的方法
            if (method.isAnnotationPresent(Check.class)) { // 验证被@Check的方法
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + "出现了异常");
                    bw.newLine();
                    // 异常的名称是类的名称，故可通过类的实例对象获取Class对象 getClass().getSimpleName()
                    bw.write("异常出现的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause());
                    bw.newLine();
                    bw.write("==============");
                    bw.newLine();
                }
            }

        }
        bw.write(String.format("本次出现了%s次bug", number));
        bw.flush();
        bw.close();
    }
}
