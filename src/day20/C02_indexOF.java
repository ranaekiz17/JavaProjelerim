package day20;

import java.util.ArrayList;
import java.util.List;

public class C02_indexOF {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");


        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat]

        System.out.println(isimler.get(2));

        System.out.println("Ferhat");
    }
}
