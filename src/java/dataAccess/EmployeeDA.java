package dataAccess;

import dbcon.ConnectionManager;
import bean.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDA {
    static Connection con = null; 
	static ResultSet rs = null;
        
        public EmployeeDA() {
        con = ConnectionManager.getConnection();
    }
    public List <Employee> getAllCust(){
        List<Employee> employ = new ArrayList <Employee>();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM EMPLOYEE ");
            while (rs.next()) {
            	Employee emp = new Employee();
            	emp.setEmp_id(Long.parseLong(rs.getString("EMP_ID")));
                emp.setEmp_name(rs.getString("EMP_NAME"));
                emp.setEmp_address(rs.getString("EMP_ADDRESS"));
                emp.setEmp_city(rs.getString("EMP_CITY"));
                emp.setEmp_poscode(rs.getString("EMP_POSCODE"));
                emp.setEmp_state(rs.getString("EMP_STATE"));
                emp.setEmp_email(rs.getString("EMP_EMAIL"));
                emp.setEmp_username(rs.getString("EMP_USERNAME"));
                emp.setEmp_password(rs.getString("EMP_PASSWORD"));
                emp.setEmp_phone(rs.getString("EMP_PHONE"));
                emp.setEmp_role(rs.getString("EMP_ROLE"));
            	
            	
            	employ.add(emp);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("employ "+employ);
        return employ;    
    }
    
    public void addemp(Employee emp) {
    	try {
    		//System.out.println(is);
         	Statement statement = con.createStatement();
         	System.out.println("INSERT INTO EMPLOYEE(EMP_ID, EMP_NAME, EMP_ADDRESS, EMP_CITY, EMP_POSCODE, EMP_STATE, EMP_PHONE, EMP_EMAIL, EMP_ROLE, EMP_USERNAME, EMP_PASSWORD)  "
				+ "VALUES ('"+emp.getEmp_id()+"','"+emp.getEmp_name()+"','"+emp.getEmp_address()+"','"+emp.getEmp_city()+"','"+emp.getEmp_poscode()+"','"+emp.getEmp_state()+"','"+emp.getEmp_phone()+"','"+emp.getEmp_email()+"','"+emp.getEmp_role()+"','"+emp.getEmp_username()+"','"+emp.getEmp_password()+"')");
         	ResultSet rs = statement.executeQuery("INSERT INTO EMPLOYEE(EMP_ID, EMP_NAME, EMP_ADDRESS, EMP_CITY, EMP_POSCODE, EMP_STATE, EMP_PHONE, EMP_EMAIL, EMP_ROLE, EMP_USERNAME, EMP_PASSWORD)"
         											+ "VALUES ('"+emp.getEmp_id()+"','"+emp.getEmp_name()+"','"+emp.getEmp_address()+"','"+emp.getEmp_city()+"','"+emp.getEmp_poscode()+"','"+emp.getEmp_state()+"','"+emp.getEmp_phone()+"','"+emp.getEmp_email()+"','"+emp.getEmp_role()+"','"+emp.getEmp_username()+"','"+emp.getEmp_password()+"')");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
    
    public void updateEmployee(Employee emp) {
        try {
           	Statement statement = con.createStatement();
                            
                System.out.println("UPDATE employee "
                             +"SET emp_name = '"+emp.getEmp_name()+"',"
                             +"emp_address = '"+emp.getEmp_address()+"',"
                             +"emp_city = '"+emp.getEmp_city()+"',"
                             +"emp_poscode = '"+emp.getEmp_poscode()+"',"
                             +"emp_state = '"+emp.getEmp_state()+"',"
                             +"emp_email = '"+emp.getEmp_email()+"',"
                             +"emp_username = '"+emp.getEmp_username()+"',"
                             +"emp_password = '"+emp.getEmp_password()+"',"
                             +"emp_role = '"+emp.getEmp_role()+"',"
                             +"emp_phone = '"+emp.getEmp_phone()+"'"
                             +" where emp_id = '"+emp.getEmp_id()+"'");
                
                ResultSet rset = statement.executeQuery("UPDATE employee "
                             +"SET emp_name = '"+emp.getEmp_name()+"',"
                             +"emp_address = '"+emp.getEmp_address()+"',"
                             +"emp_city = '"+emp.getEmp_city()+"',"
                             +"emp_poscode = '"+emp.getEmp_poscode()+"',"
                             +"emp_state = '"+emp.getEmp_state()+"',"
                             +"emp_email = '"+emp.getEmp_email()+"',"
                             +"emp_username = '"+emp.getEmp_username()+"',"
                             +"emp_password = '"+emp.getEmp_password()+"',"
                             +"emp_role = '"+emp.getEmp_role()+"',"
                             +"emp_phone = '"+emp.getEmp_phone()+"'"
                             +" where emp_id = '"+emp.getEmp_id()+"'");
                
      	 }catch (SQLException e) {
   	        e.printStackTrace();
      	 }
      }
    
    public void deleteEmployee(long id) {
    	try {
         	Statement statement = con.createStatement();
         	ResultSet rs = statement.executeQuery("DELETE FROM EMPLOYEE WHERE EMP_ID = '"+id+"'");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
}
