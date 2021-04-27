package Task10;
import java.util.Scanner;
public class MainAnimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bird b1 = new Bird("yen");
        b1.toString();
        Fish f1 = new Fish("sau");
        f1.toString();
        Tiger t1 = new Tiger("cop");
        t1.toString();
        b1.fly();
        f1.swim();
        f1.dive();
        t1.run(30);
        System.out.println("Nhap tong khoi luong thuc an:");
        int mass = scan.nextInt();
        Food m1 = new Food(mass);
        Animal a1 = new Animal(m1);
        System.out.println("luong thuc an cho 1 lan la:");
        int m = scan.nextInt();
        a1.eat(m1,m);
        System.out.println("tao gia 1 con thu moi:");
        System.out.println("1. Bird");
        System.out.println("2. Fish");
        System.out.println("3. Tiger");
        System.out.println("Moi ban chon:");
        int i = scan.nextInt();
        if(i==1){
            Bird b2 = new Bird();
            System.out.println("Moi ban nhap ten cho con thu moi:");
            String name = scan.nextLine();
            b2.HaveBaby(name);
            b2.fly();
        }else if (i==2){
            Fish f2 = new Fish();
            System.out.println("Moi ban nhap ten cho con thu moi:");
            String name = scan.nextLine();
            f2.HaveBaby(name);
            f2.swim();
            f2.dive();
        }else{
            Tiger t2 = new Tiger();
            System.out.println("Moi ban nhap ten cho con thu moi:");
            String name = scan.nextLine();
            t2.HaveBaby(name);
            t2.run(20);
        }
    }
}
