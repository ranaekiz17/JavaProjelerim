package Arrays;

public class ArraysSoru {

    public static void main(String[] args) {

       // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] arr1 = {5,9,6,7,3};


        System.out.println(ArraydaToplam(arr1));
    }

    public static int  ArraydaToplam (int [] arr1) {
        int toplam =0;
        for (int i = 0; i < arr1.length; i++) {
            toplam+= arr1[i];

        }
        return toplam;
    }
}
