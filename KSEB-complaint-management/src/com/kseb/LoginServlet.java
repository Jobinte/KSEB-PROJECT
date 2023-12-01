package com.kseb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		Connection conn=null;
		DBconnection dbcon=new DBconnection();
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String uname = request.getParameter("userName");
			String pass = request.getParameter("password");
			
			conn=dbcon.getConnection();
			pst=con.prepareStatement("select * from servletproject where user_name?,where user_password?");
			pst.setString(1,uname);
			pst.setString(2,pass);
			rs=pst.executeQuery();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
