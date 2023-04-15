package Arrays;

import java.util.Arrays;

public class Arrays_QB {
    public static void main(String[] args) {

           /*
           Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı
           ve en büyük negatif elemanı bulunuz.
           Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
           */


        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i + 1] > 0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i + 1]);

            }
        }

    }
}