package eBookShop.Models;

public class Cart {
    private int bookID;
    private String title;
    private double price;
    private int qty;
    private int discount;

    public Cart(){
        bookID = 0;
        title = "";
        price = 0;
        qty = 0;
        discount = 0;
    }
    public Cart(int bookID,String title,double price,int qty,int discount){
        this.bookID=bookID;
        this.title= title;
        this.price=price;
        this.qty=qty;
        this.discount=discount;
    }
    public Cart(int bookID,String title,double price,int qty){
        this.bookID=bookID;
        this.title= title;
        this.price=price;
        this.qty=qty;
    }

    public int getQty() {
        return qty;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getBookID() {
        return bookID;
    }

    public int getDiscount() {
        return discount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30.2f%-30d%-30d",bookID,title,price,qty,discount);
    }
}