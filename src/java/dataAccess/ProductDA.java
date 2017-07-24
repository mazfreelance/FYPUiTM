package dataAccess;

import dbcon.ConnectionManager;
import bean.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

public class ProductDA {
    static Connection con = null; 
	static ResultSet rs = null;
        
        public ProductDA() {
        con = ConnectionManager.getConnection();
    }
    public List <Product> getAllProduct(){
        List<Product> product = new ArrayList <Product>();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM PRODUCT ");
            while (rs.next()) {
            	Product pro = new Product();
            	pro.setProduct_id(rs.getString("PRO_ID"));
            	pro.setProduct_name(rs.getString("PRO_NAME"));
                pro.setProduct_type(rs.getString("PRO_TYPE"));
                pro.setProduct_desc(rs.getString("PRO_DESC"));
                pro.setProduct_price(rs.getString("PRO_PRICE"));
            	
            	
            	product.add(pro);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Product: "+product);
        return product;    
    }
    
    public void addProduct(Product pro) {
    	try {
    		//System.out.println(is);
         	Statement statement = con.createStatement();
         	System.out.println("INSERT INTO PRODUCT(PRO_ID, PRO_NAME, PRO_TYPE, PRO_DESC, PRO_PRICE )  "
				+ "VALUES ('"+pro.getProduct_id()+"','"+pro.getProduct_name()+"','"+pro.getProduct_type()+"','"+pro.getProduct_desc()+"','"+pro.getProduct_price()+"')");
         	ResultSet rs = statement.executeQuery("INSERT INTO PRODUCT(PRO_ID, PRO_NAME, PRO_TYPE, PRO_DESC, PRO_PRICE )"
         											+ "VALUES ('"+pro.getProduct_id()+"','"+pro.getProduct_name()+"','"+pro.getProduct_type()+"','"+pro.getProduct_desc()+"','"+pro.getProduct_price()+"')");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
    public void updateProduct(Product pro) {
    	try {
         	Statement statement = con.createStatement();
                
                System.out.println("UPDATE PRODUCT "
                             +"SET pro_name = '"+pro.getProduct_name()+"',"
                             +"pro_type = '"+pro.getProduct_type()+"',"
                             +"pro_desc = '"+pro.getProduct_desc()+"',"
                             +"pro_price = '"+pro.getProduct_price()+"',"
                             +" where pro_id = '"+pro.getProduct_id()+"'");
                
                ResultSet rset = statement.executeQuery("UPDATE PRODUCT "
                             +"SET pro_name = '"+pro.getProduct_name()+"',"
                             +"pro_type = '"+pro.getProduct_type()+"',"
                             +"pro_desc = '"+pro.getProduct_desc()+"',"
                             +"pro_price = '"+pro.getProduct_price()+"' "
                             +" where pro_id = '"+pro.getProduct_id()+"'");
                
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
    public void deleteProduct(String id) {
    	try {
    		//System.out.println(is);
         	Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("DELETE FROM PRODUCT WHERE PRO_ID = '"+id+"'");
         						
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
    
}
