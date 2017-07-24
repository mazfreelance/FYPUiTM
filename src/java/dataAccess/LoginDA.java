package dataAccess;

import bean.*;
import dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDA {
    
    static Connection currentCon = null; 
    static ResultSet rs = null;
    
    public static Customer logincust(Customer cust) { // preparing some objects for connection 
		
		Statement stmt = null; 
		String username = cust.getCust_username();
		String password = cust.getCust_password();
		
		String searchQuery = "select * from CUSTOMER where CUST_USERNAME='" + username + "' AND CUST_PASSWORD ='" + password +"'"; 
		// "System.out.println" prints in the consollogine; Normally used to trace the process  
		System.out.println("Query: " + searchQuery); 
		
		try { // connect to DB 
			String name = null;
                        Long id = null;
                        
			currentCon = ConnectionManager.getConnection(); 
			stmt = currentCon.createStatement(); 
			rs = stmt.executeQuery(searchQuery); 
			boolean more = rs.next(); // if user does not exist set the isValid variable to false 
			if (!more) { 
				System.out.println("Sorry, you are not a registered user! Please sign up first"); 
				cust.setValid(false); 
			} // if user exists set the isValid variable to true 
			else if (more) { 
				name = rs.getString("CUST_NAME");
                                id = rs.getLong("CUST_ID");
				System.out.println("Welcome " + name); 
				cust.setCust_name(name);
                                cust.setCust_id(id);
				cust.setValid(true);
			}
			
		} 
		
		catch (Exception ex) { 
			System.out.println("Log In failed: An Exception has occurred! " + ex); // some exception handling 
		}
		
		finally { 
			if (rs != null) { 
				try { 
					rs.close();
				} catch (Exception e) { 
					
				} 
				rs = null; 
			} 
			if (stmt != null) { 
				try { 
					stmt.close(); 
				} catch (Exception e) { 
					
				} 
				stmt = null; 
			} 
			if (currentCon != null) { 
				try { 
					currentCon.close(); 
				} catch (Exception e) {
					
				} 
				currentCon = null; 
			} 
		} 
			
		return cust;
	}
    public static Employee login(Employee emp) { // preparing some objects for connection 
		
		Statement st = null; 
		String username = emp.getEmp_username();
		String password = emp.getEmp_password();
		
		try { // connect to DB 
                        String searchQuery ;
                        if (!(username.equalsIgnoreCase("STAF01"))){
                        searchQuery = "select * from EMPLOYEE where EMP_USERNAME='" + username + "' AND EMP_PASSWORD ='" + password +"'"; 
                        // "System.out.println" prints in the consollogine; Normally used to trace the process  
                        System.out.println("Query: " + searchQuery); 
                
                            String name = null;

                            currentCon = ConnectionManager.getConnection(); 
                            st = currentCon.createStatement(); 
                            rs = st.executeQuery(searchQuery); 
                            boolean more = rs.next(); // if user does not exist set the isValid variable to false 
                            if (!more) { 
                                    System.out.println("Sorry, you are not a registered user! Please sign up first"); 
                                    emp.setValid(false); 
                            } // if user exists set the isValid variable to true 
                            else if (more) { 
                                    name = rs.getString("EMP_NAME");
                                    System.out.println("Welcome " + name); 
                                    emp.setEmp_name(name);

                                    emp.setValid(true);
                            }
                        }
		} 
		
		catch (Exception ex) { 
			System.out.println("Log In failed: An Exception has occurred! " + ex); // some exception handling 
		}
		
		finally { 
			if (rs != null) { 
				try { 
					rs.close();
				} catch (Exception e) { 
					
				} 
				rs = null; 
			} 
			if (st != null) { 
				try { 
					st.close(); 
				} catch (Exception e) { 
					
				} 
				st = null; 
			} 
			if (currentCon != null) { 
				try { 
					currentCon.close(); 
				} catch (Exception e) {
					
				} 
				currentCon = null; 
			} 
		} 
			
		return emp;
	}
    
    public static Employee loginadmin(Employee emp) { // preparing some objects for connection 
		
		Statement st = null; 
		String username = emp.getEmp_username();
		String password = emp.getEmp_password();
		
		try { // connect to DB 
			String searchQuery ;
                        if (username.equalsIgnoreCase("STAF01")){
                        searchQuery = "select * from EMPLOYEE where EMP_USERNAME='" + username + "' AND EMP_PASSWORD ='" + password +"'"; 
                        // "System.out.println" prints in the consollogine; Normally used to trace the process  
                        System.out.println("Query: " + searchQuery); 
                        
                            String name = null;

                            currentCon = ConnectionManager.getConnection(); 
                            st = currentCon.createStatement(); 
                            rs = st.executeQuery(searchQuery); 
                            boolean more = rs.next(); // if user does not exist set the isValid variable to false 
                            if (!more) { 
                                    System.out.println("Sorry, you are not a registered user! Please sign up first"); 
                                    emp.setValid(false); 
                            } // if user exists set the isValid variable to true 
                            else if (more) { 
                                    name = rs.getString("EMP_NAME");
                                    System.out.println("Welcome " + name); 
                                    emp.setEmp_name(name);

                                    emp.setValid(true);
                            }
                        }
		} 
		
		catch (Exception ex) { 
			System.out.println("Log In failed: An Exception has occurred! " + ex); // some exception handling 
		}
		
		finally { 
			if (rs != null) { 
				try { 
					rs.close();
				} catch (Exception e) { 
					
				} 
				rs = null; 
			} 
			if (st != null) { 
				try { 
					st.close(); 
				} catch (Exception e) { 
					
				} 
				st = null; 
			} 
			if (currentCon != null) { 
				try { 
					currentCon.close(); 
				} catch (Exception e) {
					
				} 
				currentCon = null; 
			} 
		} 
			
		return emp;
	}
}
