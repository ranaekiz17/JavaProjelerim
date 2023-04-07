package Arrays_QuestionSoruBankasi;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
        // o öğelerin baş harflerini alınız.
        //   Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM


        String[] isimler = {"Kemal", "Jonathan", "Mark", "Angie", "Veli","Neriman"};


        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].endsWith("n") || isimler[i].endsWith("k")) {

                System.out.println(isimler[i].substring(0, 1)); // J M N


            }
        }


    }
}