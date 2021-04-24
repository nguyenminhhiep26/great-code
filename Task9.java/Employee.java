package task9;

 class Employee {
     String empId;
     String epName;
     int salary;
     float commission;

     public Employee(String id, String name, int sal){
         empId = id;
         epName = name;
         salary = sal;
     }

     public void calcCommission(float sales){
         if (sales > 10000)
             commission = salary * 20/100;
         else
             commission = 0;
     }


     public void calcCommission(int overtime){
         if (overtime > 8)
             commission = salary/30;
         else
             commission = 0;
     }

     public void displayDetails(){
         System.out.println("EmployeeID : " + empId);
         System.out.println("EmployeeName : " + epName);
         System.out.println("Salary : " + salary);
         System.out.println("Commission : " + commission);
     }
 }

 class EmployeeDetails{
     public static void main(String[] args) {
         Employee objEmp = new Employee("ABC", "Hiep", 15000);

         objEmp.calcCommission(5000);
         objEmp.displayDetails();
     }
 }
