package Mutable_Immutable;

import java.util.ArrayList;
import java.util.List;

public class Mutable_Immutable4 {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for(Integer v : values);
       // System.out.println(v);

        // for each loop -----------  kod okuma  sorusudur

    }
}
