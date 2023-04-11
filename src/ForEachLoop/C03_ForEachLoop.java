package ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.
         */

        String [] sehir ={"Canakkale","Ankara","Denizli","Antalya","Bolu"};

        List<String> liste= new ArrayList<>();

        for (String each:sehir
             ) {
            if(each.length()%2 == 0){
                liste.add(each.substring(0,each.length()/2));

        }else{
             liste.add(each.substring(each.length()/2));
            }


    }
        System.out.println(liste);
    }
}
