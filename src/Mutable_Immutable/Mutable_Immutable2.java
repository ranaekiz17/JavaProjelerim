package Mutable_Immutable;

import java.util.ArrayList;
import java.util.List;

public class Mutable_Immutable2 {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<String>();
        liste.add("one");
        liste.add("two");
      //  liste.add(7);

        for (String s: liste);
       // System.out.println(s);

        /*
        Compile time error on line 13
         */


    }
}
