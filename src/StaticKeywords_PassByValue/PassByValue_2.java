package StaticKeywords_PassByValue;

import java.sql.Array;
import java.util.Arrays;

public class PassByValue_2 {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        elementleriArttir(arr,4);
        System.out.println("Method call'dan sonra arr"+  Arrays.toString(arr));

    }


    public static void elementleriArttir (int [] arr , int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += artisMiktari;


        }
        System.out.println("Array'deki elementleri arttir :" + Arrays.toString(arr));
    }
}
