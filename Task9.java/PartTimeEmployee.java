package task9;

 class PartTimeEmployee extends Employee{
     String shift;
     public PartTimeEmployee(String id, String name , int sal , String shift){
         super(id,name,sal);
         this.shift = shift;
     }

     public void displayDetails(){
         calcCommission(12);
         super.displayDetails();
         System.out.println("Working shift : " + shift);
     }
}

class EmployeeDetails1 {
    public static void main(String[] args) {
        Employee objEmp = new Employee("NMH", "Tu", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("----------------------------------");

        Employee objEmp1 = new PartTimeEmployee("TTT", "THU",500000,"Day");
        objEmp1.displayDetails();

    }
}
