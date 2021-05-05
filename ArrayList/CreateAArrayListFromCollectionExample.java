package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateAArrayListFromCollectionExample {
    public static void main(String[] args) {
   List<Integer> Hiep = new ArrayList<>();
   Hiep.add(1);
   Hiep.add(2);
   Hiep.add(3);
   Hiep.add(4);
   Hiep.add(5);

   List<Integer> Trung = new ArrayList<>(Hiep);

   List<Integer> Thu = new ArrayList<>();
   Thu.add(10);
   Thu.add(11);
   Thu.add(12);
   Thu.add(13);

   Trung.addAll(Thu);
        System.out.println(Trung);

    }
}
