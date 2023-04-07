package MultiDem.Arrays;

public class Arrays4 {

    public static void main(String[] args) {

        //Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int [][] arr = {{2,4,9,4},{6,9,7},{2,1,3,6}};

        System.out.println(TumSayilarinCarpimi(arr));
    }

    public static int TumSayilarinCarpimi(int[][] arr) {

        int carpim= 1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim *= arr[i][j];

            }

        }

        return carpim;
    }
}
