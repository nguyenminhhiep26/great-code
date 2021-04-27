package Task10;

import java.util.Scanner;

public class MainCat_Rat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten meo:");
        String name = scan.nextLine();
        System.out.println("Nap Toc do chay cua meo:");
        int speed = scan.nextInt();
        Cat c1 = new Cat(name, speed);

        System.out.println("Nhap ten chuot:");
        String ten = scan.nextLine();
        System.out.println("Nap Toc do chay cua chuot:");
        int td = scan.nextInt();
        System.out.println("Nhap can nang cua con chuot:");
        int weight = scan.nextInt();
        Rat r1 = new Rat(ten, td, weight);
        if(c1.getSpeed() <= r1.getSpeed()){
            r1.run();
            System.out.println("Khong bat duoc chuot len chiu doi");
            System.out.println("Chuot van con, choi tiep");
        }else {
            c1.run();
            Rat r2 = new Rat(weight);
            Cat c2 = new Cat(r2);
            c1.eat(r2);
            System.out.println("Da het chuot! het phim");
        }
    }
}
