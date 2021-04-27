package Task10;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public Bird() {
    }

    public void fly(){
        System.out.println("Con chim:" + super.getName()+ " bay duoc rat cao!");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }

    @Override
    public String toString() {
        return "Name of your new bird is:" + super.getName();
    }
}
