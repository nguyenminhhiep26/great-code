package eBookShop.Models;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private int years;
    private int genre;
    private int status;
    private int qty;
    private double price;
    private String createddate;
    private String updateddate;

    public Book(int bookID, String title, String author, double price, int qty) {
        this.bookID = bookID;
        this.title = title;
        this.author=author;
        this.price = price;
        this.qty = qty;
    }
    public Book(int bookID,String title,String author,int years,int genre,int status,int qty,double price,String createddate,String updateddate){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.years=years;
        this.genre=genre;
        this.status=status;
        this.qty=qty;
        this.price=price;
        this.createddate=createddate;
        this.updateddate=updateddate;
    }
    public Book(){
        bookID=0;
        title="";
        author="";
        price=0;
        qty=0;
        years=0;
        genre=0;
        status=0;
        createddate="";
        updateddate="";
    }

    public int getYears() {
        return years;
    }

    public String getCreateddate() {
        return createddate;
    }

    public int getStatus() {
        return status;
    }

    public int getGenre() {
        return genre;
    }

    public int getBookID() {
        return bookID;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getQty() {
        return qty;
    }

    public String getUpdateddate() {
        return updateddate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdateddate(String updateddate) {
        this.updateddate = updateddate;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30d%-30d%-30d%-30d%-30.2f%-30s%-30s\n",bookID,title,author,years,genre,status,qty,price,createddate,updateddate);
    }
}