package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        Iterator<Integer> numbersIterator = number.iterator();
        while (numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if (num % 2 != 0){
                numbersIterator.remove();
            }
        }
        System.out.println(number);
    }
}
