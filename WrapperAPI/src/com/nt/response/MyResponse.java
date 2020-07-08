package com.nt.response;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper {
	/*public HttpServletResponse resp;
	public CharArrayWriter charWriter;

	public MyResponse(HttpServletResponse response) {
		super(response);
		resp = response;
		charWriter = new CharArrayWriter();

	}

	public PrintWriter getWriter() throws IOException {
		PrintWriter writer = new PrintWriter(charWriter);
		return writer;
	}

	public String toString() {
		return charWriter.toString();
	}
*/
	  private HttpServletResponse response;
      private CharArrayWriter charWriter;
      
	public MyResponse(HttpServletResponse response) {
		super(response);
		this.response=response;
		charWriter=new CharArrayWriter();
	}
	
	@Override
	public PrintWriter getWriter() throws IOException {
		PrintWriter pw=new PrintWriter(charWriter);
		return pw;
	}
	
	@Override
	public String toString() {
	  return charWriter.toString();
	}

}
