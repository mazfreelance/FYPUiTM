
<%@ page import="bean.Employee" %>
<%  Employee currentUser = (Employee)(session.getAttribute("currentSessionUser")); %>

<div id="top">
        <h1><a href="adminHome.jsp">Administrator Panel</a></h1>
        <div id="top-navigation">
        Welcome, <a href="#"><strong><%= currentUser.getEmp_name() %></strong></a>

        <span>|</span>
        <a href="home.jsp">Log out</a>
        </div>
</div>