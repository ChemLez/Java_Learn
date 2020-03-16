package cn.liizhi.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document文档对象。
 * Element对象的使用
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {

        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 1.getElementById​(String id)：根据id属性值获取唯一的element对象
        Element name = document.getElementById("123lz");
        System.out.println(name);
        System.out.println("----");

        // 2.getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
        Elements name1 = document.getElementsByTag("name");
        System.out.println(name1);


        System.out.println("-----");

        // 3.getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);

        System.out.println("--------");
        // 4.getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合
        Elements id1 = document.getElementsByAttributeValue("id", "123lz");
        System.out.println(id1);
    }
}
