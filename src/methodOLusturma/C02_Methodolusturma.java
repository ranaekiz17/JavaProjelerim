package methodOLusturma;

public class C02_Methodolusturma {

    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun

       int faktoriyel= FaktoriyelHesapla(5);
        System.out.println(faktoriyel);
    }



    public static int FaktoriyelHesapla( int sayi1) {
          int faktoriyel = 1;
        for (int i = sayi1; i >= 1; i--) {
            faktoriyel *= i;


        }


       return faktoriyel;
    }
}
