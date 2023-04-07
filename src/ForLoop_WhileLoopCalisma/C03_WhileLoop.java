package ForLoop_WhileLoopCalisma;

import java.util.Scanner;

public class C03_WhileLoop {


    public static void main(String[] args) {


        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali

        Scanner scan = new Scanner(System.in);


        int deneme = 0;
        String sifre = "";
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);


        while (deneme != 4) {

            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();

            if (ilkHarf >= 'a' && ilkHarf <= 'z') {
                deneme++;

            } else {
                System.out.println("Yanlıs giris.Ilk harf kucuk harf olmali");
            }
            if (sonHarf >= 'A' && sonHarf <= 'Z') {
                deneme++;
            } else {
                System.out.println("Yanlıs giris.Ilk harf buyuk harf olmali");
            }

            if (!sifre.contains("  ")) {
                deneme++;

            } else {
                System.out.println("Yanlıs giris.Bosluk ıcermemeli");
            }
            if (sifre.length() >= 8) {
                deneme++;


            } else {
                System.out.println("Yanlıs giris.Sifre en az 8 karakter veya daha uzun olmalidir");
            }


        }

        System.out.println( "Tebrikler" +   deneme   + "denemenizde basarili sifre olusturuldu" );
    }
}