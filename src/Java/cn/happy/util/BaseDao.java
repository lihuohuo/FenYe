package cn.happy.util;

/**
 * Created by lenovo on 2017/6/16.
 */


        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;

/**
 * 数据访问的工具类
 *
 * @author microc
 *
 */
public class BaseDao {

    // 驱动字符串
    public static final String driver = "com.mysql.jdbc.Driver";
    // url
    public static final String url = "jdbc:mysql://localhost:3306/empdb";
    // 用户名
    public static final String username = "root";
    // 密码
    public static final String password = "";
    Connection con;
    ResultSet rs;
    PreparedStatement ps;

    // 获取连接对象的方法
    public Connection getConnection() throws Exception {
        Class.forName(driver);
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }

    // 执行查询的方法
    public ResultSet executeQuery(String sql, Object... objs) throws Exception {
        con = getConnection();
        ps = con.prepareStatement(sql);
        for (int i = 0; i < objs.length; i++) {
            ps.setObject(i + 1, objs[i]);
        }
        rs= ps.executeQuery();
        return rs;
    }

    // 执行增、删、改操作
    public int executeUpdate(String sql, Object... objs) throws Exception {
        int count = 0;
        con = getConnection();
        try {
            ps = con.prepareStatement(sql);
            if (ps != null) {
                for (int i = 0; i < objs.length; i++) {
                    ps.setObject(i + 1, objs[i]);
                }
            }
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    // 关闭三个连接对象 Connection、prepareStatement、ResultSet
    public void closeAll() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

