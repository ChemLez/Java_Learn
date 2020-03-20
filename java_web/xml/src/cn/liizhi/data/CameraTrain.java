package cn.liizhi.data;

import cn.liizhi.xml.jsoup.JsoupDemo03;
import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class CameraTrain {

    public static void main(String[] args) throws XpathSyntaxErrorException, IOException {

        String path = CameraTrain.class.getClassLoader().getResource("camera_training.xml").getPath();
        System.out.println(path);
        File file = new File(path);
        Document document = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//sentences/sentence/opinions/opinion");
        int number = 0;
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
            ++number;
        }
        System.out.println("---------");

        List<JXNode> texts = jxDocument.selN("//sentences/sentence/text");
        int count = 0;
        for (JXNode text : texts) {
            Element element = text.getElement();
            System.out.println(element.text());
            count++;
        }
        System.out.println("number:" + number);
        System.out.println("count:" + count);
    }
}
