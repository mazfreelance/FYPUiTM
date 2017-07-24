package dataAccess;

import dbcon.ConnectionManager;
import bean.Booking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingDA {
    static Connection con = null; 
	static ResultSet rs = null;
        
        public BookingDA() {
        con = ConnectionManager.getConnection();
        }
    public void updateBooking(Booking bk) {
        try {
                SimpleDateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
                Date finish = bk.getBookdatefinish();
                
                
           	Statement statement = con.createStatement();
                            
                System.out.println("UPDATE booking "
                             +"SET book_date_finished = '"+formate.format(finish)+"',"
                             +"book_status = '"+bk.getBookstatus()+"'"
                             +" where book_id = '"+bk.getBookid()+"'");
                
                ResultSet rset = statement.executeQuery("UPDATE booking "
                             +"SET book_date_finished = '"+formate.format(finish)+"',"
                             +"book_status = '"+bk.getBookstatus()+"'"
                             +" where book_id = '"+bk.getBookid()+"'");
                
      	 }catch (SQLException e) {
   	        e.printStackTrace();
      	 }
      }
    public void deleteBooking(Booking bk){
        try {
         	Statement statement = con.createStatement();
         	ResultSet rs = statement.executeQuery("DELETE FROM BOOKING WHERE BOOK_ID = '"+bk.getBookid()+"'");
    	 }catch (SQLException e) {
	        e.printStackTrace();
    	 }
    }
}
