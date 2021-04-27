package Task10;
import java.util.Scanner;
public class Animal extends Food{
    protected String name;
    private Food food;
    Scanner scan = new Scanner(System.in);
    public Animal(String name) {
        this.name = name;
        System.out.println("Ten con vat moi la:" + name);
    }

    public Animal(Food food) {
        this.food = food;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    protected void eat(Food food, int m ){
        food.conlai(m);
        System.out.println("Da cho an: " + m +"kg");
        System.out.println(getFood());
    }
    public void HaveBaby(String name){
        System.out.println("ban da tao ra 1 con vat moi teen la: "+ name);
    }
    public void ScanInfo(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
