package Strings;

import java.util.Scanner;

public class dieukien1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        char hexChar = 'a' ;
        int dec;

        if (hexChar >= '0' && hexChar <= '9'){
            dec = hexChar - '0';

        }else if (hexChar >= 'A' && hexChar <= 'F'){
            dec = hexChar - 'A' + 10;

        }else if (hexChar >= 'a' && hexChar <='f'){
            dec = hexChar - 'a' + 10;

        }else {
            dec = -1;
            System.out.println("Invalid hex char");
        }
        System.out.println(hexChar + " : " + dec);
    }
}
