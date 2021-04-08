package java11;

public class Account {
    private String ID;
    private String Name;
    private int balance = 0 ;

    public Account(String tk, String ten){
        ID = tk;
        Name = ten;
    }

    public Account(String tk, String ten, int so){
        ID = tk;
        Name = ten;
        balance = so;
    }

    public String getID(){
        return ID;
    }

    public String getName(){
        return Name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        return balance;
    }
    public int debit (int amount){
        if (amount <= balance){
            balance = balance - amount;
        }else
        {
            System.out.println("amount exceeded");
        }

        return balance;
    }
//Account another
    public int transferTo( int amount){
        if (amount <= balance){
            balance = balance + amount;
        }
        else
        {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public String toString(){
        return ID + " " + Name +" " + balance;
    }

    public static void main(String[] args) {
        Account B = new Account("NGUYEN", "MINH HIEP", 1000);
        System.out.println("The ID is : " + B.ID);
        System.out.println("The Name is :" + B.Name);
        System.out.println("The Balance is " + B.balance);
        System.out.println("The credit is : " + B.credit(500));
        System.out.println("The debit is : " + B.debit(900));
        System.out.println("The transferTo is : " + B.transferTo(1000));
        System.out.println("The toString is : " + B.toString());


    }


}
