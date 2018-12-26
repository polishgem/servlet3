package com.concretepage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/HelloWorldServlet", loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	     doGet(request,response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	     response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     out.println("Hello World!");
	}
}
  