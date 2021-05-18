package Giftshop.giftview;

import Giftshop.Giftmodel.Gift;
import Giftshop.giftcontroller.GiftController;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
    GiftController GS = new GiftController();
        boolean END = false;
        while (!END){
            System.out.println("1 - Xem quà tặng");
            System.out.println("2 - Thêm quà tặng");
            System.out.println("3 - Xóa quà tặng");
            System.out.println("4 - Update ");
            System.out.println("5 - End...");
            System.out.println("---------------------------");
            System.out.println("Mời bạn chọn : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();

            switch (n){
                case 1 :
                {
                    GS.Display();
                    break;
                }

                case 2 :{
                    System.out.println("Nhập id : ");
                    int ID1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập Name : ");
                    String Name1 = sc.nextLine();
                    System.out.println("Nhập price : ");
                    int Price1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập qty : ");
                    int Qty1 = Integer.parseInt(sc.nextLine());

                    GS.insertGift(new Gift(ID1 , Name1 , Price1 , Qty1));
                    break;
                }

                case  3 :
                {
                    System.out.println("nhập id : ");
                    int ID2 = Integer.parseInt(sc.nextLine());

                    GS.deleteGift(new Gift(ID2));
                    break;
                }

                case 4:
                {
                    System.out.println("nhập ID : ");
                    int ID3 = Integer.parseInt(sc.nextLine());
                    System.out.println("New name : ");
                    String name3 = sc.nextLine();
                    System.out.println("New price : ");
                    int price3 = Integer.parseInt(sc.nextLine());
                    System.out.println("New qty : ");
                    int qty3 = Integer.parseInt(sc.nextLine());

                    GS.updateGift(new Gift(ID3,name3,price3,qty3));
                    break;
                }

                case 5:
                {
                    END = true;
                    System.out.println("End .....!");
                }

            }
        }

    }
}
