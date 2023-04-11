package ForEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        int [] arr = {1,2,3,5};

        KarelerToplami(arr);
    }

    public static void KarelerToplami(int[] arr) {

        int toplam =0;

        for (int each:arr
             ) {
            toplam+= each*each;
        }
        System.out.println(toplam);
    }
}
