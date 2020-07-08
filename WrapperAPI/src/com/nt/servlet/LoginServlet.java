package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// General Setting
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
        System.out.println("hii");
		// Read form data
		String uname=null;
		String pwd=null;
		uname= req.getParameter("uname");
		pwd = req.getParameter("pwd");
        System.out.println("hello");
		// write Validation logic
        if(!uname.equals("null") && !pwd.equals("null")){
		if (uname.equals("vineet@gmail.com") && pwd.equals("vineet")) {
			pw.println("<h1>Valid Credentials!!!</h1>");
		} else {
			pw.println("<h1>InValid Credentials!!!</h1>");
		}
		pw.println("<br> " + uname + "  " + pwd);
        }else{
        	pw.println("Null Pointer Exception");
        }
		// close stream
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
