package com.chai;

import com.chai.utils.jdbcUtils;

import java.sql.*;

public class Testprepare {
    public static void main(String[] args) {
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement st=null;
        try{
            conn= jdbcUtils.getConnection();
            String sql="delete from users where id=?";
            st=conn.prepareStatement(sql);
            st.setInt(1,4);
            int i=st.executeUpdate();
            if(i>0){
                System.out.println("插入成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            jdbcUtils.release(conn,st,null);
        }

    }
}
