package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvvShows = new ArrayList<>();
        tvvShows.add("Breaking Bad");
        tvvShows.add("Game Of Thrones");
        tvvShows.add("Friends");
        tvvShows.add("Prison break");


        System.out.println("== Iterate using Java 8 forEach and lambda ===");
       tvvShows.forEach(tvvShow ->{
           System.out.println(tvvShow);
       });

        System.out.println("\n== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n Iterate using a listIterator() to traverse in both directions ===");

        ListIterator<String> tvShowListIterator = tvvShows.listIterator(tvvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ====");
        for (String tvShow: tvvShows){
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i =0 ; i< tvvShows.size(); i++){
            System.out.println(tvvShows.get(i));
        }
    }
}
