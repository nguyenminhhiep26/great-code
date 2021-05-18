package eBookShop.Models;

public class Order {
    private int orderID;
    private int customerID;
    private int discount;
    private double total;
    private String orderdate;
    private int status;
    private String createddate;
    private String updateddate;

    public Order(){
        orderID = 0;
        createddate="";
        customerID=0;
        discount=0;
        total=0;
        orderdate="";
        status=0;
        updateddate="";
    }
    public Order(int orderID,int customerID,int discount,double total,String orderdate,int status,String createddate,String updateddate){
        this.orderID=orderID;
        this.orderdate=orderdate;
        this.customerID=customerID;
        this.discount=discount;
        this.total=total;
        this.status=status;
        this.createddate=createddate;
        this.updateddate=updateddate;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getDiscount() {
        return discount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}