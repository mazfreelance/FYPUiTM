package bean;

import java.util.Date;


public class Booking {
    private String bookid;
    private Date bookdate;
    private Date bookdatefinish;
    private float bookprice;
    private String bookstatus;
    private long custid;
    private String productid; 
    private Date finish;

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public Date getBookdate() {
        return bookdate;
    }

    public void setBookdate(Date bookdate) {
        this.bookdate = bookdate;
    }

    public Date getBookdatefinish() {
        return bookdatefinish;
    }

    public void setBookdatefinish(Date bookdatefinish) {
        this.bookdatefinish = bookdatefinish;
    }

    public float getBookprice() {
        return bookprice;
    }

    public void setBookprice(float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
    }

    public long getCustid() {
        return custid;
    }

    public void setCustid(long custid) {
        this.custid = custid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }
    
}
