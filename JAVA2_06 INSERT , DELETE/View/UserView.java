package eBookShop.View;

import eBookShop.Controllers.RegisterController;
import eBookShop.Models.User;

import java.sql.ResultSet;
import java.util.Scanner;

public class UserView {
    Scanner input = new Scanner(System.in);
    public  String slt;
    public  ResultSet rst;
    BookShop bookShop = new BookShop();

    public int checkUser(User user) {
        int y = user.getRole();
        if (y == 1) {
           bookShop.menuCustomer(user);
            return 1;
        } else if (y == 2) {
            bookShop.menuAdmin(user);
            return 2;
        }
        return 0;
    }

    public void createAccount() {
        System.out.println("Enter your account:");
        String name = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();
        System.out.println("Enter your role: (1-customer, 2-admin)");
        int role = Integer.parseInt(input.nextLine());
        User obj = new User(name, password, role);
        RegisterController signUp = new RegisterController();
        signUp.signUp(obj);
        bookShop.menuUser();
    }
}
