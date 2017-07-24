<%
    String url = request.getRequestURI();
    String pg = "";
    if(url.endsWith("staffHome.jsp")) {
        pg="staffHome";
    }
    else if (url.endsWith("product.jsp")) {
        pg="product";
    }
    else if (url.endsWith("booking.jsp")) {
        pg="book";
    }
    else if (url.endsWith("report.jsp")) {
        pg="report";
    }
%>               

<div id="navigation">
			<ul>
                            <li><a href='staffHome.jsp' <%=pg.equals("staffHome") ? "class='active'" : ""%> ><span>Customer</span></a></li>
			    <li><a href="product.jsp"  <%=pg.equals("product") ? "class='active'" : ""%>><span>Product</span></a></li>
                            <li><a href="booking.jsp" <%=pg.equals("book") ? "class='active'" : ""%>><span>Booking</span></a></li>
			    <li><a href="report.jsp" <%=pg.equals("report") ? "class='active'" : ""%>><span>Report</span></a></li>
			</ul>
		</div>