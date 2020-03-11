package cn.itcast.annotation.demo;

public class Calculator {

    @Check
    public void nul() {
        String str = null;
        System.out.println(str.toString());
    }

    @Check
    public void add() {
        System.out.println("1 + 0 = "+ (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1 - 0 = " + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show() {
        System.out.println("no bug...");
    }
}
