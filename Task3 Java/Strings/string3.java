package Strings;

public class string3 {
    public static void main(String[] args) {
        char c1 = '0';
        char c2 = 'A';
        char c3;

        //char + int -> int + int -> int
        //c3 = c1 + 5;
        c3 = (char) (c1 + 5);
        System.out.println(c3);
        System.out.println(c1 + 5);

        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum){
            System.out.println((char) codeNum + ":" + codeNum);
        }
    }
}
