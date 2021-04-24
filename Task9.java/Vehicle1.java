package task9;

 class Vehicle1 {
     protected String vehicleNo;
     protected String vehicleName;
     protected int wheels;

     public Vehicle1(String vID, String vName, int numWheels){
         vehicleNo = vID;
         vehicleName = vName;
         wheels = numWheels;

     }

     public void accelerate(int speed){
         System.out.println("Accelerating at : " + speed + "kmph");
     }


}


