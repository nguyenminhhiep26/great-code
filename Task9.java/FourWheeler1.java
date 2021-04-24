package task9;

public  class FourWheeler1 extends  Vehicle1 {
    private boolean powerSteer;

    public FourWheeler1(String vID, String vName, int numWheels, boolean pSteer) {
        super(vID, vName, numWheels);
        powerSteer = pSteer;
    }


    public void showDetails() {
        System.out.println("Vehicle no : " + vehicleNo);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Number of Wheels : " + wheels);

        if (powerSteer == true){
            System.out.println("Power Steering : Yes");
        }
        else
            System.out.println("Power Steering : No");
    }

    @Override
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maximum acceleration : " + speed + "kmph");
    }

    public static void main(String[] args) {
        FourWheeler1 F1 = new FourWheeler1("NMH123","MINH HIEP ", 1000,true);
        F1.showDetails();
        F1.accelerate(200);
    }
}