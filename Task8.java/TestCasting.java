package task8.java;

public class TestCasting {
    public static void main(String[] args) {
        A a1 = new C();
        System.out.println(a1);
        B b1 = (B) a1;
        System.out.println(b1);

        C c1 = (C) b1;
        System.out.println(c1);


        A a2 = new B();
        System.out.println(a2);
        B b2 = (B) a2;
        C c2 = (C) a2;
    }
}
