package Task10;


public class Rat extends Animal{
    private int Speed, weight;

    public Rat(String name, int speed, int weight) {
        super(name);
        this.Speed = speed;
        this.weight = weight;
    }

    public Rat(int weight) {
        this.weight= weight;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("Meo khong duoi kip chout");
    }
}
