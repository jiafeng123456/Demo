package com.example.time.test;

import java.sql.*;

/*
 *@description:
 *@author jiafeng
 *@date 2019/11/22 0022 16:03
 */
public class DbManager {
    private static final String URL="jdbc:mysql://localhost:3306/sbtj?";//数据库连接字符串，这里的deom为数据库名
    private static final String NAME="root";//登录名
    private static final String PASSWORD="123456";//密码

    public ResultSet TheSqlConnection()
    {
        ResultSet rs = null;
        //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("未能成功加载驱动程序，请检查是否导入驱动程序！");
            //添加一个println，如果加载驱动异常，检查是否添加驱动，或者添加驱动字符串是否错误
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("获取数据库连接成功！");
            String sql = "SELECT * FROM (SELECT\n" +
                    "\t\tlast_report_manufactor,\n" +
                    "\t\tlast_report_device_model,\n" +
                    "\t\tcount(*),\n" +
                    "sum(IF(create_stamp>'2019-10' and create_stamp < '2019-11',1,0)),\n" +
                    "sum(IF(last_report_city is NULL,1,0))\n" +
                    "FROM\n" +
                    "\tv_device_bbms\n" +
                    "WHERE \n" +
                    "create_stamp < '2019-12'\n" +
                    "GROUP BY\n" +
                    "\tlast_report_manufactor,\n" +
                    "\t\tlast_report_device_model) a LEFT JOIN v_device_manufactor_types b ON a.last_report_device_model = b.model AND a.last_report_manufactor = b.manufactor;";
            PreparedStatement ps =  conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("last_report_manufactor")+"||"+rs.getString("last_report_device_model")+"||"+rs.getString("count(*)")+"||"+ rs.getString("sum(IF(create_stamp>'2019-10' and create_stamp < '2019-11',1,0))") +"||"+ rs.getString("sum(IF(last_report_city is NULL,1,0))")+"||"+ rs.getString("manufactor")+"||"+rs.getString("model")+"||"+rs.getString("brand")+"||"+rs.getString("device_type"));
            }

        } catch (SQLException e) {
            System.out.println("获取数据库连接失败！");
            //添加一个println，如果连接失败，检查连接字符串或者登录名以及密码是否错误
            e.printStackTrace();
        }

        //数据库打开后就要关闭
        if(conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                conn=null;
            }
        }
        return rs;
    }


}