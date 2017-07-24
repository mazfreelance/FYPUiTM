
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


public class EmployeeController1 extends HttpServlet {

    private EmployeeDA eda;
    public EmployeeController1() {
        super();
        eda = new EmployeeDA();
        // TODO Auto-generated constructor stub
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("adding")){
            System.out.println("ADD");
            Employee emp = new Employee();
            emp.setEmp_id(Long.parseLong(request.getParameter("ic")));
            emp.setEmp_name(request.getParameter("name"));
            emp.setEmp_address(request.getParameter("address"));
            emp.setEmp_city(request.getParameter("city"));
            emp.setEmp_poscode(request.getParameter("code"));
            emp.setEmp_state(request.getParameter("state"));
            emp.setEmp_email(request.getParameter("email"));
            emp.setEmp_username(request.getParameter("username"));
            emp.setEmp_password(request.getParameter("pass"));
            emp.setEmp_phone(request.getParameter("phone"));
            emp.setEmp_role(request.getParameter("role"));
            
            eda.addemp(emp);
				
            RequestDispatcher view = request.getRequestDispatcher("managestaff.jsp");
            request.setAttribute( "nonExists", "3" );
            request.setAttribute("dispMsg", "1");
            view.forward(request, response);
				
        }else if (action.equalsIgnoreCase("update")){
            Employee emp = new Employee();
            emp.setEmp_id(Long.parseLong(request.getParameter("ic")));
            emp.setEmp_name(request.getParameter("name"));
            emp.setEmp_address(request.getParameter("address"));
            emp.setEmp_city(request.getParameter("city"));
            emp.setEmp_poscode(request.getParameter("code"));
            emp.setEmp_state(request.getParameter("state"));
            emp.setEmp_email(request.getParameter("email"));
            emp.setEmp_username(request.getParameter("username"));
            emp.setEmp_password(request.getParameter("pass"));
            emp.setEmp_phone(request.getParameter("phone"));
            emp.setEmp_role(request.getParameter("role"));
            
            
            eda.updateEmployee(emp);
            
            RequestDispatcher view = request.getRequestDispatcher("managestaff.jsp");
            request.setAttribute("dispMsg", "Successfully Updated!");
            view.forward(request, response);
            
        }else if (action.equalsIgnoreCase("delete")){
            long empIC = Long.parseLong(request.getParameter("ic"));
	    eda.deleteEmployee(empIC);
	               
	    RequestDispatcher view = request.getRequestDispatcher("managestaff.jsp");
            request.setAttribute( "nonExists", "1" );
            request.setAttribute("dispMsg", "Successfully Deleted!");
            view.forward(request, response);
        }
    }

    

}
