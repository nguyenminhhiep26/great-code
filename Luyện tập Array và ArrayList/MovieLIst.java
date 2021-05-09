package BTarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieLIst {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        List<String> Phim = new ArrayList<>();
        Phim.add("The Prestige ");
        Phim.add("Black Swan");
        Phim.add("Lost in Translation ");
        Phim.add("Pulp Fiction");
        Phim.add("In the Mood for Love ");


            System.out.println("1. Thêm phim mới .");
            System.out.println("2. In ra danh sách phim ");
            System.out.println("3. Chỉnh sửa tên phim đã có ");
            System.out.println("4. xóa đi bộ phim trong danh sách");
            System.out.println("5. Tìm kiếm tên phim trong danh sách");
            System.out.println("6. Kết thúc");
            System.out.println("------------------------------------------");
            System.out.println("bạn muốn làm gì ? ");
            i =  sc.nextInt();

            switch (i){
                case 1:
                    System.out.println("Mời bạn nhập tên phim mới :  ");
                    Scanner S = new Scanner(System.in);
                    String c = S.nextLine();
                    Phim.add(c);
                    System.out.println("Phim " + c + " đã được thêm vào danh sách ở vị trí số : " + Phim.indexOf(c));
                    System.out.println(Phim);
                    break;

                case 2:
                    System.out.println("Các bộ phim yêu thích trong danh sách là : ");
                    for (String ds : Phim){
                        System.out.println(ds);
                    }
                    break;

                case 3:
                    System.out.println("Bạn muốn chỉnh sửa tên phim ở vị trí  : ");
                    int v = sc.nextInt();
                    System.out.println("Bạn muốn sửa thành : ");
                    Scanner P = new Scanner(System.in);
                    String s = P.nextLine();
                    Phim.set(v,s);
                    System.out.println("Tên phim đã được sửa : ");
                    System.out.println(v+"." + Phim.get(v));
                    System.out.println(Phim);
                    break;

                case 4:
                    System.out.println("Bạn muốn xóa phim ở vị trí : ");
                    int x = sc.nextInt();
                    Phim.remove(x);
                    System.out.println("Bạn đã xóa thành công");
                    System.out.println("Danh sách phim còn lại là : ");
                    System.out.println(Phim);
                    break;

                case 5:
                    System.out.println("Nhập tên phim mà bạn muốn  tìm ");
                    Scanner D = new Scanner(System.in);
                    String t = D.nextLine();
                    System.out.println(Phim);
                    System.out.println("Vị trí của phim : " + t + " là ở vị trí  " + Phim.indexOf(t) );
                    break;

                case 6:
                    System.out.println("Kết thúc");

            }

    }
}
