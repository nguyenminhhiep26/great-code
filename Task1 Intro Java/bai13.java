package sesion2;

public class bai13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 999; i <= 2010; i++) {
            if (i % 4 == 0) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
