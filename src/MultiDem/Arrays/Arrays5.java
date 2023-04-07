package MultiDem.Arrays;

import java.util.Arrays;

public class Arrays5 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun.


        int[][] arr = {{2, 4, 9, 4}, {6, 9, 7}, {2, 1, 3, 6}};

        SonElementToplami(arr);


    }

    public static void SonElementToplami(int[][] arr) {

        int toplam = 0;

        int i;
        for (i = 0; i < arr.length; i++) {

            for (int j = arr[i].length - 1; j < arr[i].length; j++) {
                toplam += arr[i][j];

            }

        }
        System.out.println(toplam);


    }
}

