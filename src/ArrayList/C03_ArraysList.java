package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraysList {

    public static void main(String[] args) {
        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        // kismini list olarak bize donduren bir method olusturun

        List<String> list = new ArrayList<>(Arrays.asList("portakal", "elma", "cilek", "muz"));


        System.out.println(istenmeyeniSil(list, "a"));
    }

    public static List<String> istenmeyeniSil(List<String> list, String istenmeyenHarf) {


        List<String> yeniList= new ArrayList<>();
        for (String each : list
        ) {
            if (!each.contains(istenmeyenHarf)) {
                yeniList.add(each);

            }

        }

        return yeniList;
    }

}



