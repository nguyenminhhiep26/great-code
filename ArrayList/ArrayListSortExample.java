package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("hiep");
        names.add("huong");
        names.add("David");

        System.out.println("Names : " + names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        names.sort((name1, name2) -> name1.compareTo(name2));

        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names : " + names);
    }
}
