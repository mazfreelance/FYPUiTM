package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataAccess.*;
import dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.RequestDispatcher;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class ProductController extends HttpServlet {
    private ProductDA pda;
    
    public ProductController() {
        super();
        pda = new ProductDA();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("add")){
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
                FileItem  id = (FileItem) items.get(0);
                String photoid =  id.getString();
                
                FileItem name = (FileItem) items.get(1);
                String   photoname =  name.getString();
                
                FileItem type = (FileItem) items.get(2);
                String   phototype =  type.getString();
                
                FileItem desc = (FileItem) items.get(3);
                String   photodesc =  desc.getString();
                
                FileItem price = (FileItem) items.get(4);
                String   photoprice =  price.getString();
                float harga = Float.parseFloat(photoprice);

                // get uploaded file
                FileItem file = (FileItem) items.get(5);

                // Connect to Oracle
                Connection con = ConnectionManager.getConnection();
                con.setAutoCommit(false);

                PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?,?)");
                ps.setString(1, photoid);
                ps.setString(2, photoname);
                ps.setString(3, phototype);
                ps.setString(4, photodesc);
                ps.setFloat(5, harga);
                // size must be converted to int otherwise it results in error
                ps.setBinaryStream(6, file.getInputStream(), (int) file.getSize());
                ps.executeUpdate();
                con.commit();
                con.close();
                RequestDispatcher view = request.getRequestDispatcher("product.jsp");
                request.setAttribute( "nonExists", "2" );
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
                FileItem  id = (FileItem) items.get(0);
                String photoid =  id.getString();

                FileItem name = (FileItem) items.get(1);
                String   photoname =  name.getString();
                
                FileItem type = (FileItem) items.get(2);
                String   phototype =  type.getString();
                
                FileItem desc = (FileItem) items.get(3);
                String   photodesc =  desc.getString();
                
                FileItem price = (FileItem) items.get(4);
                String   photoprice =  price.getString();
                float harga = Float.parseFloat(photoprice);

                // get uploaded file
                FileItem file = (FileItem) items.get(5);

                // Connect to Oracle
                Connection con = ConnectionManager.getConnection();
                con.setAutoCommit(false);

                PreparedStatement ps = con.prepareStatement("update product SET pro_name = ?, pro_type = ?, pro_desc = ?, pro_price = ?, pro_img = ? where pro_id = ? ");
                ps.setString(1, photoname);
                ps.setString(2, phototype);
                ps.setString(3, photodesc);
                ps.setFloat(4, harga);
                // size must be converted to int otherwise it results in error
                ps.setBinaryStream(5, file.getInputStream(), (int) file.getSize());
                ps.setString(6, photoid);
                ps.executeUpdate();
                con.commit();
                con.close();
                RequestDispatcher view = request.getRequestDispatcher("product.jsp");
                request.setAttribute( "nonExists", "2" );
                request.setAttribute("dispMsg", "Successfully Updated!");
                view.forward(request, response);
                //out.println("Photo Added Successfully.");
            }
            catch(Exception ex) {
                out.println( "Error --> " + ex.getMessage());
            }
				
        }else if (action.equalsIgnoreCase("delete")){
            System.out.println("delete");
            String id = request.getParameter("proid");
            
            pda.deleteProduct(id);
				
            RequestDispatcher view = request.getRequestDispatcher("product.jsp");
            request.setAttribute( "nonExists", "2" );
            request.setAttribute("dispMsg", "Successfully Deleted!");
            view.forward(request, response);
				
        }
        
        
    }

    

}
