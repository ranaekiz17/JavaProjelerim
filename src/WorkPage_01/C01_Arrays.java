package WorkPage_01;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Nurefsan","Betul","Canan"};
        int [] sayilar = {3,5,7,2,2,2,3,5,6,};

        String[] arr = new String[5];

        System.out.println(isimler); //[Ljava.lang.String;@58ceff1

        System.out.println(Arrays.toString(isimler)); // [Nurefsan, Betul, Canan]

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 7, 2, 2, 2, 3, 5, 6]

        int [] a = new int[7];

        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        a[0] = 4;
        a[3] = 7;

        System.out.println(Arrays.toString(a)); // [4, 0, 0, 7, 0, 0, 0]


        //sayilar array inin 4. indexini yazdirin

        System.out.println(sayilar[4]); //2




    }
}
