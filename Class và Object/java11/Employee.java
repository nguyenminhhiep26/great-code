package java11;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int tk, String ten, String ho, int tien){
        ID = tk;
        firstName = ten;
        lastName = ho;
        salary = tien;
    }

    public int getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return lastName + firstName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        return salary * 12 + 5000;
    }

    public String toString (){
        return  ID + " "+ lastName + " "+ firstName +" "+ salary;
    }

    public static void main(String[] args) {
        Employee FPT = new Employee(111 , "Minh Hiep", "Nguyen", 15000 );
        System.out.println("The ID is :  " + FPT.ID );
        System.out.println("The LastName is :" + FPT.lastName);
        System.out.println("The FirstName is " + FPT.firstName);
        System.out.println("The Name is " + FPT.getName());
        System.out.println("The Salary is " + FPT.salary);
        FPT.setSalary(20000);
        System.out.println(FPT.getSalary());
        System.out.println("The AnnualSalary is " + FPT.getAnnualSalary());
        System.out.println("The Salary new is " + FPT.raiseSalary(5000));
        System.out.println("The toString is : " + FPT.toString());
    }
}
