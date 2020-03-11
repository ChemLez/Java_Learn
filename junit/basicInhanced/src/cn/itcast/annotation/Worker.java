package cn.itcast.annotation;

@AnnTest03
public class Worker {



    private String name;

    /**
     *
     * @param a 整数
     * @param b 整数
     * @return a + b
     */
    @AnnTest03
    public int add(int a,int b) {
        return a + b;

    }


}
