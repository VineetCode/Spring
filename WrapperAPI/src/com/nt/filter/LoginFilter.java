package com.nt.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.request.MyRequest;
import com.nt.response.MyResponse;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {
		
		//create custom Request Object
		HttpServletRequest hreq=(HttpServletRequest)req;
		MyRequest myRequest=new MyRequest(hreq);
		
		//create custom Response object
		HttpServletResponse hresp=(HttpServletResponse)res;
		MyResponse myResponse=new MyResponse(hresp);
		System.out.println("before");
		fc.doFilter(myRequest, myResponse);
		System.out.println("after");
		//get Servlet Response 
		String result=myResponse.toString().toUpperCase();
		
		//add signature at the end
		PrintWriter pw=res.getWriter();
		pw.println(result+"<br><br>--Marathalli,Bangalore");
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
