package eBookShop.Models;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String email;
    private String phone;
    private int member;
    private String createddate;
    private String updateddate;

    public Customer(){
        customerID=0;
        name="";
        address="";
        email="";
        phone="";
        member=0;
        createddate="";
        updateddate="";
    }
    public Customer(int customerID,String name,String address,String email,String phone,int member,String createddate,String updateddate){
        this.updateddate=updateddate;
        this.createddate=createddate;
        this.member=member;
        this.email=email;
        this.customerID=customerID;
        this.phone=phone;
        this.name=name;
        this.address=address;
    }
    public Customer(int id,String name,String address,String email,String phone,int member){
        this.customerID=id;
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.member=member;
    }

    public String getCreateddate() {
        return createddate;
    }

    public String getName() {
        return name;
    }

    public String getUpdateddate() {
        return updateddate;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getMember() {
        return member;
    }

    public void setUpdateddate(String updateddate) {
        this.updateddate = updateddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setMember(int member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30s%-30s%-30d%-30s%-30s",customerID,name,address,email,phone,member,createddate,updateddate);
    }
}