package cn.liz.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private static DataSource dataSource;


    /**
     * 加载配置文件
     * 初始化连接对象
     * 即 获取数据库连接池，从数据库连接池获取连接对象
     */
    static {
        try {
            Properties properties = new Properties();
            InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            //load()方法其实就是逐行读取properties配置文件，分隔成两个字符串key和value，将他们放进Properties对象中。
            //后面如果需要用到这些值，直接调用Properties对象就可以了。
            properties.load(inputStream);
            // 初始化连接对象，工厂方法
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 获取连接池对象
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 通过连接池获取连接对象
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }


}
