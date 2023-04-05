package com.sendRedirectmethod;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/magic")
public class Magicservlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		System.out.println("First servlet reached");
		res.sendRedirect("sec");
	}

}
