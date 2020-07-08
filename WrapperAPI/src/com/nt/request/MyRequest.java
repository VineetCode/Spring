package com.nt.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper{
   /* public HttpServletRequest req;
	public MyRequest(HttpServletRequest request) {
		super(request);
       req=request;
	}
	
	public String getParameter(String name){
		
		String pval=null;
		pval=req.getParameter(name);
		if(name.equals("user")){
			if(pval.indexOf("@gmail.com")==-1){
				pval=pval+"@gmail.com";
				return pval;
			}//if
		}//if
		return pval;
	}//getParameter(-) method
*/
	
	
	 private HttpServletRequest request;
		public MyRequest(HttpServletRequest request) {
			super(request);
			this.request=request;
		}
		
		@Override
		public String getParameter(String name) {
			String pval=null;
				pval=request.getParameter(name);
			if(name.equals("uname")){
				  if(pval.indexOf("@gmail.com")==-1){
					   pval=pval+"@gmail.com";
				  }//fi
			}//pf
			return pval;
		
		}//method
}
