package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");

        System.out.println(animals);

        animals.add(1,"Thu");
        System.out.println(animals);
    }
}
