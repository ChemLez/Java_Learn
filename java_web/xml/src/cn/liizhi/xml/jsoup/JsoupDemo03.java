package cn.liizhi.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {

        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elementById = document.getElementsByTag("student").get(0).getElementsByTag("name");
        System.out.println(elementById);
        System.out.println("--------------------");
        System.out.println(document.getElementById("1234lz").getElementsByTag("name"));
        System.out.println("--------------------");
        Elements elementsByTag = document.getElementsByAttribute("number").get(0).getElementsByTag("name");
        System.out.println(elementsByTag);
        System.out.println("---------------------");
        Element attr = document.getElementsByTag("student").get(0);
        System.out.println(attr);
        System.out.println("---------------------");
        String id = attr.attr("number");
        System.out.println(id);
        Elements name = attr.getElementsByTag("name");
        System.out.println(name);
        System.out.println("-----------");
        String id1 = name.attr("id");
        System.out.println(id1);
        System.out.println("-----------");

        Element student = document.getElementsByTag("student").get(0);
        String name_text = student.getElementsByTag("name").text();
        System.out.println(name_text);
    }
}

