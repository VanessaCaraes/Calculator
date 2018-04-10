package com.calculatrice.beans;

import javax.servlet.http.HttpServletRequest;

import com.sun.xml.internal.ws.client.RequestContext;

public class Operation {

	


	public Double addition( HttpServletRequest request) 	
	{
		String numberone1 = request.getParameter("numberone");		
		String numbertwo1 = request.getParameter("numbertwo");	
		
		double premiernombre = Double.parseDouble(numberone1);		
		double secondnombre = Double.parseDouble(numbertwo1);
		Double result = premiernombre + secondnombre;		
	
		
		//System.out.println(result);
		 		
		return result;
	}
		
	public Double substraction( HttpServletRequest request) 	
	{
		String numberone1 = request.getParameter("numberone");		
		String numbertwo1 = request.getParameter("numbertwo");	
		
		double premiernombre = Double.parseDouble(numberone1);		
		double secondnombre = Double.parseDouble(numbertwo1);
		
		Double result = premiernombre - secondnombre;		
		
		//System.out.println(result);
		 		
		return result;
	}
	
	public Double multiplication( HttpServletRequest request) 	
	{
		String numberone1 = request.getParameter("numberone");		
		String numbertwo1 = request.getParameter("numbertwo");	
		
		double premiernombre = Double.parseDouble(numberone1);		
		double secondnombre = Double.parseDouble(numbertwo1);
		
		Double result = premiernombre * secondnombre;	
		
		//System.out.println(result);
		 		
		return result;
	}
	
	
	public Object division( HttpServletRequest request) 	
	{
		String numberone1 = request.getParameter("numberone");			
		
		String numbertwo1 = request.getParameter("numbertwo");	
				
		double premiernombre = Double.parseDouble(numberone1);		
		
		double secondnombre = Double.parseDouble(numbertwo1);
		
		Object result =  "";
		
		if (premiernombre == 0 || secondnombre == 0) {
				
		 result =  "Please choose a number which is different from zero";
		
		
		} else  result = premiernombre/secondnombre;	
		
				 		
		return result;
		
		}
	
			
	
	

}
