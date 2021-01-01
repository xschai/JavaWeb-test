package com.chai;

import com.chai.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            conn=jdbcUtils.getConnection();
            st=conn.createStatement();
            String sql="INSERT INTO users(id,`NAME`,`PASSWORD`,`email`,`birthday`)" +
                    " VALUES(4,'kuangshen','123456','32413@qq.com','2020-01-01')";
            int i=st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            jdbcUtils.release(conn,st,rs);
        }

    }
}
