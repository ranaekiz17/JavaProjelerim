package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_ArrayList {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        String[] arr = {"L", "M", "L", "P", "N", "P"};


        System.out.println(Arrays.toString(mukerrerOlaniSil(arr)));

    }

    public static String[] mukerrerOlaniSil(String[] arr) {

        ArrayList<String> liste = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (!liste.contains(arr[i])) {
                liste.add(arr[i]);
            }
        }

        String [] arr1 = new String[liste.size()];

        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = liste.get(i);

        }

       //System.out.println(liste);
        return arr1;
    }
}
