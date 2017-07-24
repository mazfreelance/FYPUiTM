package dataAccess;

import dbcon.ConnectionManager;
import bean.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDA {
        static Connection con = null; 
	static ResultSet rs = null;
        
        public CustomerDA() {
        con = ConnectionManager.getConnection();
    }
    public List <Customer> getAllCust(){
        List<Customer> custo = new ArrayList <Customer>();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM CUSTOMER ");
            while (rs.next()) {
            	Customer cust = new Customer();
            	cust.setCust_id(Long.parseLong((rs.getString("CUST_ID"))));
            	cust.setCust_name(rs.getString("CUST_NAME"));
            	cust.setCust_address(rs.getString("CUSTOMER_ADDRESS"));
                cust.setCust_city(rs.getString("CUST_CITY"));
                cust.setCust_poscode(rs.getString("CUST_POSCODE"));
                cust.setCust_state(rs.getString("CUST_STATE"));
                cust.setCust_email(rs.getString("CUST_EMAIL"));
                cust.setCust_username(rs.getString("CUST_USERNAME"));
                cust.setCust_password(rs.getString("CUST_PASSWORD"));
            	cust.setCust_phone(rs.getString("CUST_PHONE"));
            	
            	
            	custo.add(cust);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Custom "+custo);
        return custo;    
    }
    
//    public Customer getCustID (String id) {
//    	Customer ub = new Customer();
//        try {
//        	Statement statement = connection.createStatement();
//        	ResultSet rs = statement.executeQuery("SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = "+id);
//        	if (rs.next()) {
//        		ub.setCustID(Long.parseLong((((rs.getString("CUSTOMER_ID"))))));
//        		ub.setCustName(rs.getString("CUSTOMER_NAME"));
//        		ub.setCustPhoneNum(Long.parseLong((((rs.getString("CUSTOMER_PHONE"))))));
//        		ub.setCustAddress(rs.getString("CUSTOMER_ADDRESS"));
//            }
//        	
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return ub;
//    }
    
    public void addCust(Customer cust) {
    	try {
    		//System.out.println(is);
         	Statement statement = con.createStatement();
         	System.out.println("INSERT INTO CUSTOMER(CUST_ID, CUST_NAME, CUST_ADDRESS, CUST_CITY, CUST_POSCODE, CUST_STATE, CUST_EMAIL, CUST_USERNAME, CUST_PASSWORD, CUST_PHONE )  "
				+ "VALUES ('"+cust.getCust_id()+"','"+cust.getCust_name()+"','"+cust.getCust_address()+"','"+cust.getCust_city()+"','"+cust.getCust_poscode()+"','"+cust.getCust_state()+"','"+cust.getCust_email()+"','"+cust.getCust_username()+"','"+cust.getCust_password()+"','"+cust.getCust_phone()+"')");
         	ResultSet rs = statement.executeQuery("INSERT INTO CUSTOMER(CUST_ID, CUST_NAME, CUST_ADDRESS, CUST_CITY, CUST_POSCODE, CUST_STATE, CUST_EMAIL, CUST_USERNAME, CUST_PASSWORD, CUST_PHONE )"
         											+ "VALUES ('"+cust.getCust_id()+"','"+cust.getCust_name()+"','"+cust.getCust_address()+"','"+cust.getCust_city()+"','"+cust.getCust_poscode()+"','"+cust.getCust_state()+"','"+cust.getCust_email()+"','"+cust.getCust_username()+"','"+cust.getCust_password()+"','"+cust.getCust_phone()+"')");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
    
    public void updateCustomer(Customer cust) {
        try {
           	Statement statement = con.createStatement();
                            
                System.out.println("UPDATE customer "
                             +"SET cust_name = '"+cust.getCust_name()+"',"
                             +"cust_address = '"+cust.getCust_address()+"',"
                             +"cust_city = '"+cust.getCust_city()+"',"
                             +"cust_poscode = '"+cust.getCust_poscode()+"',"
                             +"cust_state = '"+cust.getCust_state()+"',"
                             +"cust_email = '"+cust.getCust_email()+"',"
                             +"cust_username = '"+cust.getCust_username()+"',"
                             +"cust_password = '"+cust.getCust_password()+"',"
                             +"cust_phone = '"+cust.getCust_phone()+"'"
                             +" where cust_id = '"+cust.getCust_id()+"'");
                
                ResultSet rset = statement.executeQuery("UPDATE customer "
                             +"SET cust_name = '"+cust.getCust_name()+"',"
                             +"cust_address = '"+cust.getCust_address()+"',"
                             +"cust_city = '"+cust.getCust_city()+"',"
                             +"cust_poscode = '"+cust.getCust_poscode()+"',"
                             +"cust_state = '"+cust.getCust_state()+"',"
                             +"cust_email = '"+cust.getCust_email()+"',"
                             +"cust_username = '"+cust.getCust_username()+"',"
                             +"cust_password = '"+cust.getCust_password()+"',"
                             +"cust_phone = '"+cust.getCust_phone()+"'"
                             +" where cust_id = '"+cust.getCust_id()+"'");
                
      	 }catch (SQLException e) {
   	        e.printStackTrace();
      	 }
      }
    
    public void deleteCustomer(long id) {
    	try {
         	Statement statement = con.createStatement();
         	ResultSet rs = statement.executeQuery("DELETE FROM CUSTOMER WHERE CUST_ID = '"+id+"'");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
}
