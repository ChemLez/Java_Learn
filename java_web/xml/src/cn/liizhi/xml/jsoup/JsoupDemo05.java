package cn.liizhi.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class JsoupDemo05 {
    /**
     * Xpath简单的用法
     */

    public static void main(String[] args) throws IOException {
        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
    }

}
