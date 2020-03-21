package cn.liz.dao;

import cn.liz.domin.User;
import cn.liz.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库表中的User信息
 */
public class UserDao {
    // 声明JDBCTemplate对象共用
    // JdbcTemplate的使用需要借助于DataSource数据库连接池
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     *
     * @param loginUser 只有用户名和密码
     * @return 返回用户的全部信息
     */
    public User login(User loginUser) {
        // 编写SQL语句
        try {
            String sql = "select * from user where username = ? and password = ?";
            // 调用query方法
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class)
                    , loginUser.getUsername()
                    , loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }


}
