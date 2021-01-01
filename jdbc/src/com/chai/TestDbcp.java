package com.chai;

import com.chai.utils.DbcpUtils;
import com.chai.utils.jdbcUtils;

import java.sql.*;

public class TestDbcp {

    public static void main(String[] args) throws Exception {
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement st=null;
        try{
            conn= DbcpUtils.getConnection();
            String sql="delete from users where id=?";
            st=conn.prepareStatement(sql);
            st.setInt(1,3);
            int i=st.executeUpdate();
            if(i>0){
                System.out.println("插入成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DbcpUtils.release(conn,st,null);
        }

    }
}
