package com.calculatrice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.beans.Operation;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculator() {
        super();           
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/layout/calculator.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Operation op = new Operation();	
		
		Object choix = new Object();
	
	
	if(request.getParameter("addition") != null) {
		
		choix = op.addition(request);	
		
	} else if(request.getParameter("substraction")!=null) {
			
		choix = op.substraction(request);		
		
	} else if(request.getParameter("multiplication")!=null) {		

		choix = op.multiplication(request);
		
	} else if(request.getParameter("division")!=null) {		

		choix = op.division(request);
	}				
	
	request.setAttribute("choix", choix);		
	
	
	System.out.println(choix);
	
		this.getServletContext().getRequestDispatcher("/layout/calculator.jsp").forward(request, response);
	}

}
