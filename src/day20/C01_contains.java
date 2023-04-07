package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_contains {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(3);
        sayilar1.add(8);
        sayilar1.add(1);
        sayilar1.add(2);


        List<Integer> sayilar2 = new ArrayList<>();

        sayilar2.add(8);
        sayilar2.add(5);
        sayilar2.add(2);
        sayilar2.add(3);
        sayilar2.add(3);

        System.out.println(sayilar1.equals(sayilar2));  // false
    }
}
