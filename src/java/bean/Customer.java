package bean;

public class Customer {
    public boolean valid;
    private long cust_id;
    private String cust_name;
    private String cust_address;
    private String cust_city;
    private String cust_poscode;
    private String cust_state;
    private String cust_phone;
    private String cust_email;
    private String cust_username;
    private String cust_password;

    public boolean isValid() {
		return valid;
	}
    public void setValid(boolean valid) {
		this.valid = valid;
	}
        
     public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }
    
    public String getCust_city() {
        return cust_city;
    }

    public void setCust_city(String cust_city) {
        this.cust_city = cust_city;
    }

    public String getCust_poscode() {
        return cust_poscode;
    }

    public void setCust_poscode(String cust_poscode) {
        this.cust_poscode = cust_poscode;
    }

    public String getCust_state() {
        return cust_state;
    }

    public void setCust_state(String cust_state) {
        this.cust_state = cust_state;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }


    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_username() {
        return cust_username;
    }

    public void setCust_username(String cust_username) {
        this.cust_username = cust_username;
    }

    public String getCust_password() {
        return cust_password;
    }

    public void setCust_password(String cust_password) {
        this.cust_password = cust_password;
    }

    @Override
    public String toString() {
        return "Customer{" + "cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_address=" + cust_address + ", cust_phone=" + cust_phone + ", cust_username=" + cust_username + ", cust_password=" + cust_password + '}';
    }
    
}
