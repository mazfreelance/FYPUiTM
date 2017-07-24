<%@page import="java.sql.*" %>
<%@ page import="bean.Employee" %>
<%  Employee currentUser = (Employee)(session.getAttribute("currentSessionUser")); %>
<%
                Class.forName("oracle.jdbc.driver.OracleDriver");

                Connection cnn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
                Statement sm = cnn.createStatement();
                ResultSet rset = sm.executeQuery("select * from EMPLOYEE where EMP_USERNAME='" +currentUser.getEmp_username() +"'" );
                while (rset.next()) {
                    
                %>
<div id="top">
        <h1><a href="staffHome.jsp">Staff Panel</a></h1>
        <div id="top-navigation">
                Welcome, <a href="staffHome.jsp"><strong><%= currentUser.getEmp_name() %></strong></a>
                
                <span>|</span>
                <a href="updatestaff.jsp?ic=<%= rset.getString(1) %>">Profile Settings</a>
                <% } %>
                <span>|</span>
                <a href="home.jsp">Log out</a>
        </div>
</div>