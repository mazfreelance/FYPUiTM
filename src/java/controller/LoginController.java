package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bean.*;
import dataAccess.*;

public class LoginController extends HttpServlet {

    public LoginController() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try { 
                //for admin
                Employee employ = new Employee();
                employ.setEmp_username(request.getParameter("username"));
                employ.setEmp_password(request.getParameter("pass"));
                employ = LoginDA.loginadmin(employ);
                
                //for staff
                Employee emp = new Employee();
                emp.setEmp_username(request.getParameter("username"));
                emp.setEmp_password(request.getParameter("pass"));
                emp = LoginDA.login(emp);
                
                //for customer
                Customer cust = new Customer();
    		cust.setCust_username(request.getParameter("username")); 
    		cust.setCust_password(request.getParameter("pass")); 
    		cust = LoginDA.logincust(cust); 
                
    		if (cust.isValid()) { // customer only
    			HttpSession session = request.getSession(true); 
    			session.setAttribute("currentSessionUser", cust);
    			System.out.println("session here");
                        
    			response.sendRedirect("custHome.jsp");
    		}else if (emp.isValid()){ //staff only
                        HttpSession session = request.getSession(true); 
    			session.setAttribute("currentSessionUser", emp);
    			System.out.println("session here");
                        
    			response.sendRedirect("staffHome.jsp");
                }else if (employ.isValid()){ // admin only
                        HttpSession session = request.getSession(true); 
    			session.setAttribute("currentSessionUser", employ);
    			System.out.println("session here");
                        
    			response.sendRedirect("adminHome.jsp");
                }else if ( ! (emp.isValid() || cust.isValid() || employ.isValid())){
                        response.sendRedirect("invalidLogin.jsp"); 
                }
                // error page 
    		else response.sendRedirect("invalidLogin.jsp"); 
    	}
    	catch (Throwable theException) { 
    		System.out.println(theException); 
    	}
    }

}
