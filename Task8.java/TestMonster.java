package task8.java;

public class TestMonster {
    public static void main(String[] args) {
        Monster s1 = new FireMonster("hiep");
        Monster s2 = new WaterMonster("huy");
        Monster s3 = new StoneMonster("Hien");

        System.out.println(s1.attack());
        System.out.println(s2.attack());
        System.out.println(s3.attack());

        Monster s4 = new Monster("Thao");
        System.out.println(s4.attack());
    }
}
