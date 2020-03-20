package cn.liizhi.web.request;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo01")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         * 1. 获取请求行数据
         * 			* GET /day14/demo1?name=zhangsan HTTP/1.1
         * 			* 方法：
         * 				1. 获取请求方式 ：GET
         * 					* String getMethod()
         * 				2. (*)获取虚拟目录：/servlet
         * 					* String getContextPath()
         * 				3. 获取Servlet路径: /RequestDemo01
         * 					* String getServletPath()
         * 				4. 获取get方式请求参数：name=Tom
         * 					* String getQueryString()
         * 				5. (*)获取请求URI：/servlet/RequestDemo01
         * 					* String getRequestURI():		/servlet/RequestDemo01
         * 					* StringBuffer getRequestURL()  :http://localhost:8080/servlet/RequestDemo01
         *
         * 					* URL:统一资源定位符 ： 	中华人民共和国
         * 					* URI：统一资源标识符 : 		   共和国
         *
         * 				6. 获取协议及版本：HTTP/1.1
         * 					* String getProtocol()
         *
         * 				7. 获取客户机的IP地址：
         * 					* String getRemoteAddr()
         */

        String method = request.getMethod();
        System.out.println(method);

        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        String queryString = request.getQueryString();
        System.out.println(queryString);

        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);

        String protocol = request.getProtocol();
        System.out.println(protocol);

        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
