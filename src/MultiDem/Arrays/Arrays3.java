package MultiDem.Arrays;

import java.util.Arrays;

public class Arrays3 {

    public static void main(String[] args) {

        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]


        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int toplam =0;
        int [] yeniarray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

            toplam += arr[i][j];

            }
            yeniarray[i]= toplam;
            toplam=0;



            }
        System.out.print(Arrays.toString(yeniarray));

    }



    }

