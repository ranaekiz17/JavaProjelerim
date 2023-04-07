package Arrays;

import java.util.Arrays;

public class ArraysSoru3 {

    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int [] arr = {6,6,6,7,3,3,12,45,36};
        ElemanVarMi (arr,6);

        //Arrays.sort(arr);

        //System.out.println(Arrays.binarySearch(arr,3));
        //System.out.println(Arrays.binarySearch(arr,12));


        }



    public static void ElemanVarMi(int[] arr, int aranan ) {

        int flag = 0;

        for (int i = 0; i < arr.length ; i++) {
         if (arr[i] == aranan){
             flag++;

         }
        }

        System.out.println(flag);
        }
}
