package eBookShop.Models;

public class OrderDetail {
    private int orderID;
    private int bookID;
    private String title;
    private int amount;
    private double price;
    private String createddate;
    private String updateddate;

    public OrderDetail(){
        orderID = 0;
        bookID = 0;
        title = "";
        amount = 0;
        price = 0;
        createddate = "";
        updateddate = "";
    }
    public OrderDetail(int orderID,int bookID,String title, int amount,double price,String createddate,String updateddate){
        this.orderID=orderID;
        this.bookID=bookID;
        this.title=title;
        this.amount=amount;
        this.price=price;
        this.createddate=createddate;
        this.updateddate=updateddate;
    }
    public OrderDetail(int orderID,int bookID,String title, int amount,double price){
        this.orderID=orderID;
        this.bookID=bookID;
        this.title=title;
        this.amount=amount;
        this.price=price;
    }

    public int getBookID() {
        return bookID;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
