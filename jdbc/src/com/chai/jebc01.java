package com.chai;

import java.sql.*;
/*
public class jebc01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
       String username="root";
       String password="Chai@1999";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql="select * from users";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("id="+resultSet.getObject("NAME"));
            System.out.println("id="+resultSet.getObject("PASSWORD"));
            System.out.println("id="+resultSet.getObject("email"));
            System.out.println("id="+resultSet.getObject("birthday"));

        }
        resultSet.close();
        statement.close();
        connection.close();
    }

}
*/