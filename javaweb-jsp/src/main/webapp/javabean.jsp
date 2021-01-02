<%@ page import="chai.jdbc.Person" %><%--
  Created by IntelliJ IDEA.
  User: 柴旭升
  Date: 2020/12/1
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    Person person=new Person();
//    person.setAddress();
//    person.setId();
//    person.setAge();
//    person.setName();
%>

<jsp:useBean id="person" class="chai.jdbc.Person" scope="page"/>
<jsp:setProperty name="person" property="address" value="西安"/>
<jsp:setProperty name="person" property="id" value="1"/>
<jsp:setProperty name="person" property="age" value="3"/>
<jsp:setProperty name="person" property="name" value="坎坎坷坷"/>


<jsp:getProperty name="person" property="name"/>
<jsp:getProperty name="person" property="id"/>
<jsp:getProperty name="person" property="age"/>
<jsp:getProperty name="person" property="address"/>

</body>




</html>
