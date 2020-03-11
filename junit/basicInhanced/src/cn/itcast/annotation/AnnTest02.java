package cn.itcast.annotation;

public @interface AnnTest02 {

    // 属性列表
    int value();

    String name();

    Person p1();

    AnnTest01 annTest01();

    String[] queen();




}
