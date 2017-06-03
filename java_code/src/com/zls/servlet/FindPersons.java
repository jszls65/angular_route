package com.zls.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zls.util.JsonUtil;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class FindPersons
 */
public class FindPersons extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FindPersons() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    System.out.println(request.getParameter("userId"));   
	    System.out.println(request.getParameter("name"));   
	    response.setContentType("application/json; charset=UTF-8");
	    JSONObject resultJSON = new JSONObject();   
	    resultJSON.accumulate("errNum", 1);   
	    resultJSON.accumulate("errInfo", "你好");   
	  
	    PrintWriter out = response.getWriter();  
	    System.out.println(resultJSON.toString());
	    out.println(resultJSON.toString());   
	    out.flush();   
	    out.close();   
	}
	
	
	

}
