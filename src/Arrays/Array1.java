package Arrays;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin

        System.out.println(Arrays.toString(ArraydaSayiArttirma()));

        int[] arr2 = ArraydaSayiArttirma();

    }




    public static int[] ArraydaSayiArttirma() {
        int[] arr1 = {2, 10, 24, 9, 4};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 2 ;
        }

        return arr1 ;
    }
}
