package Strings;

import java.util.Scanner;

public class string13 {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String : ");
        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse is : ");
        for (int inCharIdx = inStrLen - 1; inCharIdx >=0; --inCharIdx){
            System.out.print(inStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}
