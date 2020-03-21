package cn.liz.web.servlet;

import cn.liz.dao.UserDao;
import cn.liz.domin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3.封装user对象
        User login = new User();
        login.setUsername(username);
        login.setPassword(password);
        UserDao userDao = new UserDao();
        User user = userDao.login(login);
        if (user == null) {
            // 登录失败
            req.getRequestDispatcher("/FailServlet").forward(req, resp);
        } else {
            // 登录成功
            // 存储数据
            req.setAttribute("user", user);// 键值对，键起名为user,值为user对象
            // 转发
            req.getRequestDispatcher("/SuccessServlet").forward(req, resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
