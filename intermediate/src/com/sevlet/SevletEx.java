package com.sevlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http;

public class SevletEx extends HttpServlet {
	private String ="output";
	public void init()throws ServletException{
		output ="Addvance java concepts";
	}
	public void doGet(httpServletRequest req,httpservletRespose res)
	throws ServletException,IoException{
		res.setContentType("text/xml");
		PrintWriter out = res.getWriter;
		out.println(output);
		public void destroy() {
			System.out.println("over");
		}
	}

}
