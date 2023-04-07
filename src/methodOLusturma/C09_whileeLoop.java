package methodOLusturma;

import java.util.Scanner;

public class C09_whileeLoop {

    public static void main(String[] args) {

       // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanicidan bir sayi giriniz");
        int sayi = scan.nextInt();

        int toplam= 0;

        while (sayi>0){
            toplam += sayi%10;

          sayi/=10 ;
        }
        System.out.println("Sayinin rakamlar toplami:" + toplam );
    }
}
