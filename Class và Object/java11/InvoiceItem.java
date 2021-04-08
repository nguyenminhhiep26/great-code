package java11;

public class InvoiceItem {
    private String ID;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String tk, String dec, int qt , double uni ){
        ID = tk;
        desc = dec;
        qty = qt;
        unitPrice = uni;
    }

    public String getID(){
        return ID;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty =qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return  unitPrice * qty;
    }

    public String toString(){
        return ID + " " + desc + " " + qty + " "+ unitPrice;
    }

    public static void main(String[] args) {
        InvoiceItem A = new InvoiceItem("ABC", "EPT", 123, 5.00);
        System.out.println("The ID is " + A.ID);
        System.out.println("The Desc is "+ A.desc);
        System.out.println("The Qty is " + A.qty);
        A.setQty(111);
        System.out.println(A.getQty());
        System.out.println("The unitPrice is : "+ A.unitPrice);
        A.setUnitPrice(2.00);
        System.out.println(A.getUnitPrice());
        System.out.println("The Total is :" + A.getTotal());
        System.out.println("The toString " + A.toString());
    }

}
