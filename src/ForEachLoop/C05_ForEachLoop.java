package ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {

    public static void main(String[] args) {

         // Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        // ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {5,7,12,6,10,};
        int[] arr2 = {15,7,12,16,10,27};

        List<Integer>liste = new ArrayList<>();

        for (int each1:arr1
             ) {
            for (int each2:arr2
                 ) {
                if (each1 == each2){
                    liste.add(each1);
                }

            }
        }
        System.out.println(liste);
    }
}
