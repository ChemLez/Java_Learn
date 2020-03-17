package cn.liizhi.xml.jsoup;

import com.apple.eawt.event.MagnificationEvent;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo04 {
    /**
     * select 简单用法
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements name = document.select("name");
        System.out.println(name);
        System.out.println("--------");
        Elements elements = document.select("#1234lz");
        System.out.println(elements);

        System.out.println("------");
        Elements student = document.select("student[number=\"s001\"]");
        System.out.println(student);
        System.out.println("=========");
        // 获取student下的全部子标签
        Elements age = document.select("student age");
        System.out.println(age);
        System.out.println("==========");
        // 获取其直接标签
        Elements age1 = document.select("student[number=\"s001\"] age");
        System.out.println(age1);

    }
}
