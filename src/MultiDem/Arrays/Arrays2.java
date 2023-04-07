package MultiDem.Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

       // Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
       // olusturacagimiz tek katli bir array’e bu toplamlari atayin.
       // input : int[][] arr = {{3,4,5}, {2,3,6,7}};
       // output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int [] yeniarray = new int[3];


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                yeniarray[i]= arr[i][j]+arr[i+1][j+1];


            }

        }
        System.out.println(Arrays.toString(yeniarray));

/*
        int[][] arr = {{3,4,5}, {2,3,6,7}};

// İlk olarak, yeni dizinin boyutunu belirleyin
        int size = Math.max(arr[0].length, arr[1].length);
        int[] result = new int[size];

// Daha sonra, iki boyutlu dizideki öğeleri toplayın ve yeni dizide saklayın
        for (int i = 0; i < size; i++) {
            int sum = 0;
            if (i < arr[0].length) {
                sum += arr[0][i];
            }
            if (i < arr[1].length) {
                sum += arr[1][i];
            }
            result[i] = sum;
        }

// Son olarak, yeni diziyi yazdırın
        System.out.println(Arrays.toString(result));
*/
    }
}
