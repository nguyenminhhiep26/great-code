package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bod");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Does names array contain \"Bod\" ? " + names.contains("Bod"));
        System.out.println("IndexOf \"Steve\" : " + names.indexOf("Steve"));
        System.out.println("IndexOf \"Mark\" : " + names.indexOf("Mark"));
        System.out.println("LastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("LastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
    }
}
