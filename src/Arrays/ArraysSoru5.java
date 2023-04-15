package Arrays;

public class ArraysSoru5 {

    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] yeniarr1 = {5,4,7,5,6,7,8};

        System.out.println(ArrayToplam(yeniarr1));


    }

    public static int ArrayToplam(int[] yeniarr1) {
        int toplam =0;
        for (int i = 0; i < yeniarr1.length; i++) {
            toplam+= yeniarr1[i];
        }


        return toplam;
    }
}

