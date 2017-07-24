package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataAccess.*;
import bean.*;
import javax.servlet.RequestDispatcher;

public class CustomerController1 extends HttpServlet {
    private CustomerDA cda;
    
    public CustomerController1() {
        super();
        cda = new CustomerDA();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("add")){
            System.out.println("ADD");
            Customer cust = new Customer();
            cust.setCust_id(Long.parseLong((request.getParameter("ic"))));
            cust.setCust_name(request.getParameter("name"));
            cust.setCust_address(request.getParameter("address"));
            cust.setCust_city(request.getParameter("city"));
            cust.setCust_poscode(request.getParameter("code"));
            cust.setCust_state(request.getParameter("state"));
            cust.setCust_email(request.getParameter("email"));
            cust.setCust_username(request.getParameter("username"));
            cust.setCust_password(request.getParameter("pass"));
            cust.setCust_phone(request.getParameter("phone"));;
            
            cda.addCust(cust);
				
            RequestDispatcher view = request.getRequestDispatcher("home.jsp");
            request.setAttribute( "nonExists", "2" );
            request.setAttribute("dispMsg", "Successfully Updated!");
            view.forward(request, response);
				
        }
        else if (action.equalsIgnoreCase("update")){
            Customer cust = new Customer();
            cust.setCust_id(Long.parseLong((request.getParameter("icn"))));
            cust.setCust_name(request.getParameter("name"));
            cust.setCust_address(request.getParameter("addr"));
            cust.setCust_city(request.getParameter("city"));
            cust.setCust_poscode(request.getParameter("code"));
            cust.setCust_state(request.getParameter("state"));
            cust.setCust_email(request.getParameter("email"));
            cust.setCust_username(request.getParameter("uname"));
            cust.setCust_password(request.getParameter("passw"));
            cust.setCust_phone(request.getParameter("phone"));;
            
            
            cda.updateCustomer(cust);
            
            RequestDispatcher view = request.getRequestDispatcher("custHome.jsp");
            request.setAttribute("dispMsg", "Successfully Updated!");
            view.forward(request, response);
            
        }else if (action.equalsIgnoreCase("adding")){
            System.out.println("ADD");
            Customer cust = new Customer();
            cust.setCust_id(Long.parseLong((request.getParameter("ic"))));
            cust.setCust_name(request.getParameter("name"));
            cust.setCust_address(request.getParameter("address"));
            cust.setCust_city(request.getParameter("city"));
            cust.setCust_poscode(request.getParameter("code"));
            cust.setCust_state(request.getParameter("state"));
            cust.setCust_email(request.getParameter("email"));
            cust.setCust_username(request.getParameter("username"));
            cust.setCust_password(request.getParameter("pass"));
            cust.setCust_phone(request.getParameter("phone"));;
            
            cda.addCust(cust);
				
            RequestDispatcher view = request.getRequestDispatcher("adminHome.jsp");
            request.setAttribute( "nonExists", "3" );
            request.setAttribute("dispMsg", "1");
            view.forward(request, response);
				
        }else if (action.equalsIgnoreCase("updating")){
            Customer cust = new Customer();
            cust.setCust_id(Long.parseLong((request.getParameter("icn"))));
            cust.setCust_name(request.getParameter("name"));
            cust.setCust_address(request.getParameter("addr"));
            cust.setCust_city(request.getParameter("city"));
            cust.setCust_poscode(request.getParameter("code"));
            cust.setCust_state(request.getParameter("state"));
            cust.setCust_email(request.getParameter("email"));
            cust.setCust_username(request.getParameter("uname"));
            cust.setCust_password(request.getParameter("passw"));
            cust.setCust_phone(request.getParameter("phone"));;
            
            
            cda.updateCustomer(cust);
            
            RequestDispatcher view = request.getRequestDispatcher("adminHome.jsp");
            request.setAttribute("dispMsg", "Successfully Updated!");
            view.forward(request, response);
            
        }else if (action.equalsIgnoreCase("delete")){
            long custIc = Long.parseLong(request.getParameter("ic"));
	    cda.deleteCustomer(custIc);
	               
	    RequestDispatcher view = request.getRequestDispatcher("adminHome.jsp");
            request.setAttribute( "nonExists", "1" );
            request.setAttribute("dispMsg", "Successfully Deleted!");
            view.forward(request, response);
        }
    }

  

}
