package cn.liizhi.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {

        // 1.导入jar包
        // 2.获取Document对象
        // 2.1获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        System.out.println(path);
        // 2.2解析xml文档，加载进内存，获取dom树-->document
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println("------");
        for (Element element : elements) {
            System.out.println(element);
            System.out.println("*****");
        }
        System.out.println("------");

        for (Element element : elements) {
            System.out.println(element.text());
            System.out.println("==");
        }

    }
}
