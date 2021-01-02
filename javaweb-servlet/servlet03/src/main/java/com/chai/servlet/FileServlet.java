package com.chai.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          String realPath=" C:\\Users\\柴旭升\\IdeaProjects\\javaweb-servlet\\servlet03\\target\\classes\\柴.jpg";
          System.out.println("下载文件路径："+realPath);
          String fileName=realPath.substring(realPath.lastIndexOf("\\"+1));
          resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
        FileInputStream in = new FileInputStream(realPath);
        int len=0;
        byte[] buffer=new byte[1024];
        ServletOutputStream out = resp.getOutputStream();
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
         in.close();
         out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
