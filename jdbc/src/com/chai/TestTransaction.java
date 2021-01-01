package com.chai;

import com.chai.utils.jdbcUtils;

import java.sql.*;

public class TestTransaction {
    public static void main(String[] args) {
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement st=null;
        try{
            conn= jdbcUtils.getConnection();
            conn.setAutoCommit(false);

            String sql1="update account set money=money-100 where name='A'";
            st=conn.prepareStatement(sql1);
            st.executeUpdate();
            String sql2="update account set money=money+100 where name='B'";
            st=conn.prepareStatement(sql2);
            st.executeUpdate();
            conn.commit();
            System.out.println("成功");

        } catch (SQLException e) {
           try {
               conn.rollback();
           }catch (SQLException e1)
           { e1.printStackTrace();}

        }
        finally{
            jdbcUtils.release(conn,st,null);
        }

    }
}
