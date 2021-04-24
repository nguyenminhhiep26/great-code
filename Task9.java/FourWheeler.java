package task9;

public class FourWheeler extends  Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vID,String vName, int numWheels, boolean pSteer){
        vehicleNo = vID;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }

    public void showDetails(){
        System.out.println("Vehicle no : " + vehicleNo);
        System.out.println("Vehicle Name  : " + vehicleName);
        System.out.println("Number os Wheels : " + wheels);

        if (powerSteer == true)
            System.out.println("Power Steering : Yes");
        else
            System.out.println("Power Steering : NO");
    }

    @Override
    public void accelerate(int speed){
        System.out.println("Maximum acceleration: " + speed + "kmph");
    }

    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("NMH-111", "Nguyen Minh Hiep",150,true);
        objFour.showDetails();
        objFour.accelerate(100);
    }
}
