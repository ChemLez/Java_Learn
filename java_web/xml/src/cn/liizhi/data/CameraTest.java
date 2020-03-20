package cn.liizhi.data;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CameraTest {

    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = CameraTrain.class.getClassLoader().getResource("CH_CAME_SB1_TEST_.xml").getPath();
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
        System.out.println(number);

        List<JXNode> opinions = jxDocument.selN("//sentences/sentence/opinions");
        int count = 0;
        for (JXNode opinion : opinions) {

            System.out.println(opinion);
            count++;

        }

        System.out.println(number);

        System.out.println(count);
    }
}
