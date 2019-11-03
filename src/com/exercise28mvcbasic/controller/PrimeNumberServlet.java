package com.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeNumberServlet")
public class PrimeNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(request.getParameter("txtNumberEx3"));
		boolean isPrime = true;
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		response.getWriter().append("Is number prime? " + isPrime);
	}

}
