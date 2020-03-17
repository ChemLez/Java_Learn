package cn.liizhi.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XpathDemo {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        // 3.根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        // 4.Xpath语法查询
        // 4.1查询所有的student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            Element element = jxNode.getElement();
        }

        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");
        System.out.println(jxNodes1);
        System.out.println("-----------__");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");
        System.out.println(jxNodes2);
        System.out.println("----------");
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='123lz']");
        JXNode jxNode = jxNodes3.get(0);
        System.out.println(jxNode);
    }


}
