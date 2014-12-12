package com.co;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ISingleton;
import com.MyEJBLocal;
import com.MyStateFulLocal;

/**
 * Servlet implementation class Sample
 */
@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @EJB
    MyEJBLocal myEJB;
    
    @EJB ISingleton sin;
    
    @EJB ISingleton sin2;
    
    @EJB
    MyStateFulLocal stateFul;
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		try {
			
			MyStateFulLocal local =  stateFul.getRef();
			local.sayHello();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
