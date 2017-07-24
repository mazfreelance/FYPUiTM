<%
    String url = request.getRequestURI();
    String pg = "";
    if(url.endsWith("adminHome.jsp")) {
        pg="adminhome";
    }
    else if (url.endsWith("managestaff.jsp")) {
        pg="staff";
    }
%>  

<div id="navigation">
    <ul>
        <li><a href="adminHome.jsp" <%=pg.equals("adminhome") ? "class='active'" : ""%>><span>Manage Customer</span></a></li>
        <li><a href="managestaff.jsp" <%=pg.equals("staff") ? "class='active'" : ""%>><span>Manage Staff</span></a></li>

    </ul>
</div>