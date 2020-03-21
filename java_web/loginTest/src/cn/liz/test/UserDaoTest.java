package cn.liz.test;

import cn.liz.dao.UserDao;
import cn.liz.domin.User;
import org.junit.Test;

public class UserDaoTest {


    @Test
    public void testLogin() {


        User user1 = new User();
        user1.setUsername("Tom");
        user1.setPassword("123");
        UserDao loginUser = new UserDao();
        User user = loginUser.login(user1);

        System.out.println(user);
    }


}
