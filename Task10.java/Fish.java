package Task10;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public Fish() {
    }

    public void swim(){
        System.out.println("con ca:"+ super.getName()+" boi rat xa!");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }

    public void dive(){
        System.out.println("con ca:"+ super.getName()+" boi rat sau!");
    }
    @Override
    public String toString() {
        return "Name of your new fish is:" + super.getName();
    }
}