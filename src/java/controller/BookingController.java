package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Booking;
import dataAccess.BookingDA;
import dbcon.ConnectionManager;
import java.io.PrintWriter;
import java.sql.*;
import java.text.*;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class BookingController extends HttpServlet {

    private BookingDA bda;
    
    public BookingController() {
        super();
        bda = new BookingDA();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("add")){
            System.out.println("add");
            try {
                // Apache Commons-Fileupload library classes
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload sfu  = new ServletFileUpload(factory);

                if (! ServletFileUpload.isMultipartContent(request)) {
                    System.out.println("sorry. No file uploaded");
                    return;
                }

                // parse request
                List items = sfu.parseRequest(request);
                FileItem  cust = (FileItem) items.get(0);
                String custo =  cust.getString();
                long custid = Long.parseLong(custo);
                System.out.println(custo);
                
                FileItem pro = (FileItem) items.get(1);
                String   product =  pro.getString();
                System.out.println(product);
                
                Connection con1 = ConnectionManager.getConnection();
                Statement st = con1.createStatement();
                ResultSet rst = st.executeQuery("select * from PRODUCT where PRO_ID = '"+product+"'");
                rst.next();
                float price = rst.getFloat("PRO_PRICE");
                System.out.println(price);
                
                FileItem bk = (FileItem) items.get(2);
                String   bkid =  bk.getString();
                System.out.println(bkid);
                
                String expectedPattern = "MM/dd/yyyy";
                SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
    
                FileItem fdate = (FileItem) items.get(3);
                String bdate =  fdate.getString();
                System.out.println("date string: " +bdate);
               
               SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
               Date now = format.parse(bdate);
               String datetimeStr = now.toString();
               System.out.println("1. " + datetimeStr);
               SimpleDateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
               System.out.println("2. " + formate.format(now));
                

                // get uploaded file
                FileItem payslip = (FileItem) items.get(4);

                FileItem stat = (FileItem) items.get(5);
                String   status =  stat.getString();
                
                // Connect to Oracle
                Connection con = ConnectionManager.getConnection();
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement("insert into booking(book_id, book_date, book_price, book_status, book_slip, cust_id, product_id) values(?,?,?,?,?,?,?)");
                ps.setString(1, bkid);
                ps.setString(2, formate.format(now));
                ps.setFloat(3, price);
                ps.setString(4, status);
                // size must be converted to int otherwise it results in error
                ps.setBinaryStream(5, payslip.getInputStream(), (int) payslip.getSize());
                ps.setLong(6, custid);
                ps.setString(7, product);
                
                ps.executeUpdate();
                con.commit();
                con.close();
                RequestDispatcher view = request.getRequestDispatcher("viewbook.jsp");
                request.setAttribute( "book", "1" );
                request.setAttribute("dispMsg", "Successfully Updated!");
                view.forward(request, response);
                //out.println("Photo Added Successfully.");
            }
            catch(Exception ex) {
                out.println( "Error --> " + ex.getMessage());
            }
        }
        else if (action.equalsIgnoreCase("edit")){
            System.out.println("edit");
            try {
                // Apache Commons-Fileupload library classes
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload sfu  = new ServletFileUpload(factory);

                if (! ServletFileUpload.isMultipartContent(request)) {
                    System.out.println("sorry. No file uploaded");
                    return;
                }

                // parse request
                List items = sfu.parseRequest(request);
                FileItem  cust = (FileItem) items.get(0);
                String custo =  cust.getString();
                long custid = Long.parseLong(custo);
                System.out.println(custo);
                
                FileItem bk = (FileItem) items.get(1);
                String   bkid =  bk.getString();
                System.out.println(bkid);

                // get uploaded file
                FileItem payslip = (FileItem) items.get(2);
                
                // Connect to Oracle
                Connection con = ConnectionManager.getConnection();
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement("update booking SET book_slip= ? where book_id = ? and cust_id = ? ");
                
                // size must be converted to int otherwise it results in error
                ps.setBinaryStream(1, payslip.getInputStream(), (int) payslip.getSize());
                ps.setString(2, bkid);
                ps.setLong(3, custid);
                
                ps.executeUpdate();
                con.commit();
                con.close();
                RequestDispatcher view = request.getRequestDispatcher("viewbook.jsp");
                request.setAttribute( "book", "1" );
                request.setAttribute("dispMsg", "Successfully Updated!");
                view.forward(request, response);
                //out.println("Photo Added Successfully.");
            }
            catch(Exception ex) {
                out.println( "Error --> " + ex.getMessage());
            }
        }
        else if (action.equalsIgnoreCase("adding")){
            System.out.println("adding");
            try {
                // Apache Commons-Fileupload library classes
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload sfu  = new ServletFileUpload(factory);

                if (! ServletFileUpload.isMultipartContent(request)) {
                    System.out.println("sorry. No file uploaded");
                    return;
                }

                // parse request
                List items = sfu.parseRequest(request);
                FileItem  cust = (FileItem) items.get(0);
                String custo =  cust.getString();
                long custid = Long.parseLong(custo);
                System.out.println(custo);
                
                FileItem pro = (FileItem) items.get(1);
                String   product =  pro.getString();
                System.out.println(product);
                
                Connection con1 = ConnectionManager.getConnection();
                Statement st = con1.createStatement();
                ResultSet rst = st.executeQuery("select * from PRODUCT where PRO_ID = '"+product+"'");
                rst.next();
                float price = rst.getFloat("PRO_PRICE");
                System.out.println(price);
                
                FileItem bk = (FileItem) items.get(2);
                String   bkid =  bk.getString();
                System.out.println(bkid);
                
                FileItem fdate = (FileItem) items.get(3);
                String bdate =  fdate.getString();
                System.out.println("date string: " +bdate);
               
               SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
               Date now = format.parse(bdate);
               String datetimeStr = now.toString();
               System.out.println("1. " + datetimeStr);
               SimpleDateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
               System.out.println("2. " + formate.format(now));
                

                // get uploaded file
                FileItem payslip = (FileItem) items.get(4);

                FileItem stat = (FileItem) items.get(5);
                String   status =  stat.getString();
                
                // Connect to Oracle
                Connection con = ConnectionManager.getConnection();
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement("insert into booking(book_id, book_date, book_price, book_status, book_slip, cust_id, product_id) values(?,?,?,?,?,?,?)");
                ps.setString(1, bkid);
                ps.setString(2, formate.format(now));
                ps.setFloat(3, price);
                ps.setString(4, status);
                // size must be converted to int otherwise it results in error
                ps.setBinaryStream(5, payslip.getInputStream(), (int) payslip.getSize());
                ps.setLong(6, custid);
                ps.setString(7, product);
                
                ps.executeUpdate();
                con.commit();
                con.close();
                RequestDispatcher view = request.getRequestDispatcher("booking.jsp");
                request.setAttribute( "book", "1" );
                request.setAttribute("dispMsg", "Successfully Updated!");
                view.forward(request, response);
                //out.println("Photo Added Successfully.");
            }
            catch(Exception ex) {
                out.println( "Error --> " + ex.getMessage());
            }
        }
        else if (action.equalsIgnoreCase("editing")){
            System.out.println("editing");
            Booking bk = new Booking();
            String id = request.getParameter("bkid");
            String stat = request.getParameter("status");
            String ds = request.getParameter("datefinish");
            
            bk.setBookid(id);               
            bk.setBookstatus(stat);
           
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            Date now = null;
             try {
                 now = format.parse(ds);
             } catch (ParseException ex) {
                 Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
             }
            String datetimeStr = now.toString();
            System.out.println("convert " + datetimeStr);
            bk.setBookdatefinish(now);
            
            
            System.out.println("1. " + id);
            System.out.println("2. " + stat);
            System.out.println("3. " + ds);
            
            bda.updateBooking(bk);
            
            RequestDispatcher view = request.getRequestDispatcher("booking.jsp");
            request.setAttribute("dispMsg", "Successfully Updated!");
            view.forward(request, response);
        }
        else if (action.equalsIgnoreCase("delete")){
            System.out.println("delete");
            Booking bk = new Booking();
            String id = request.getParameter("bkid");
            bk.setBookid(id);
            
            bda.deleteBooking(bk);
            RequestDispatcher view = request.getRequestDispatcher("booking.jsp");
            request.setAttribute("dispMsg", "Successfully Deleted!");
            view.forward(request, response);
        }
    }

    

}
