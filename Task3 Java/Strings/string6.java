package Strings;

public class string6 {
    public static void main(String[] args) {
        String str = "Java is coll!";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));

        // Comparing two Strings
        String anotherSt = "Java is COOL!";
        System.out.println(str.equals(anotherSt));
        System.out.println(str.equalsIgnoreCase(anotherSt));
        System.out.println(anotherSt.equals(str));
        System.out.println(anotherSt.equalsIgnoreCase(str));
    }
}
