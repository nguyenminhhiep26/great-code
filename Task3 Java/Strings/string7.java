package Strings;

public class string7 {
    public static void main(String[] args) {
        String str ="Java í coll!";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0, 3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.endsWith("coll!"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
