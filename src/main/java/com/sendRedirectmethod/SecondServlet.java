package com.sendRedirectmethod;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sec")
public class SecondServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		System.out.println("Second servlet reached");
		
	}


}
