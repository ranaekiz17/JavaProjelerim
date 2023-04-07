package methodOLusturma;

public class C06_overloading {
    public static void main(String[] args) {
        // Verilen pozitif bir tam sayininin
        // asal sayi olup olmadıgını yazdiran bir metod olusturun


        asalSayiMi(62);
        asalSayiMi(3);

    }

    public static void asalSayiMi(int sayi) {

        int sayac = 0;

        for (int i = 2; i < sayi; i++) {


            if (sayi % i == 0) {
                sayac++;

            }


        }if (sayac == 0) {
            System.out.println("Girilen sayi asal sayidir");
        }else {
            System.out.println("Girilen sayi asal sayi degildir");
        }


    }
}
