package deneme01_question;

import java.util.Scanner;

public class WhilelLoop {

    public static void main(String[] args) {

        /*

        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin

         */

        Scanner scan = new Scanner(System.in);


        int sayi = 0;
        int sayac = 0;
        int toplam = 0;

        while (true) {

            System.out.println("Lutfen pozitif tam sayi giriniz, \nbitirmek istediginizde sifira basiniz");
            sayi = scan.nextInt();



            if (sayi == 0) {
                break;


            } else if (sayi < 0) {
                System.out.println("Negatif sayi kullanamazsiniz");
            }else if (sayi> 0){
                sayac++;
                toplam += sayi;

            }


        }

        System.out.println("Toplam  " + sayac + "adet sayi girdiniz. Sayiların toplamı: " + toplam);
    }
}
