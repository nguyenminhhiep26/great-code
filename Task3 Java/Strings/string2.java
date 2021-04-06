package Strings;

public class string2 {
    public static void main(String[] args) {
        char c1 = '0';
        char c2 = 'A';
        char c3;

        // char + char -> int + int -> int
        //c3 = c1 + c2
        c3 = (char)(c1 + c2 );
        System.out.println(c3);
        System.out.println(c1 + c2);
        System.out.println((char)(c1+c2));
    }
}
