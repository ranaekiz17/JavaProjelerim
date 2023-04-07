package Arrays;

import java.util.Arrays;

public class ArrayaEkle {

   // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
   // eski array’e yeni degeri atayin.

    public static void main(String[] args) {
        int [] arr = {3,5,7,9,2,6};
        System.out.println (Arrays.toString(ArrayaElemanEkleme(arr, 4)));
    }

    public static int[] ArrayaElemanEkleme(int[] arr, int ekleneneleman) {
        int [] arr1 = new int[7];

        for (int i = 0; i < arr.length ; i++) {
            arr1[i]= arr[i];


        }
        arr1[arr1.length-1]= ekleneneleman;
        return arr1;
    }

}
