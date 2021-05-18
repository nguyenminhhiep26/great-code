package Giftshop.Giftmodel;

public class Gift {
    private  int ID ;
    private  String Name;
    private  float Price;
    private int Qty;

    public Gift(int ID, String name, float price, int qty) {
        this.ID = ID;
        Name = name;
        Price = price;
        Qty = qty;
    }

    public Gift(int ID){
        this.ID = ID;
    }

    public Gift (int ID, String Name){
        this.ID = ID;
        this.Name  =Name;
    }

    public Gift(){
        this.ID = 0;
        this.Name = "";
        this.Price = 0;
        this.Qty = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Qty=" + Qty +
                '}';
    }
}
