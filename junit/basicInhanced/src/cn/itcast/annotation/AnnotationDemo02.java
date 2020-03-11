package cn.itcast.annotation;

public class AnnotationDemo02 {


    @AnnTest01
    @AnnTest02(value = 1, name = "Tom"
            , p1 =  Person.p1, annTest01 = @AnnTest01() , queen = {"Tom","Lisa"})
    public void eat() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
