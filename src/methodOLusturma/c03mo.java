package methodOLusturma;

import java.util.Scanner;

public class c03mo {

    public static void main(String[] args) {

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10'dan kucuk iki pozitif tamsayi aliniz");
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();

        int a =C02_Methodolusturma.FaktoriyelHesapla(sayi1);
        int b =C02_Methodolusturma.FaktoriyelHesapla(sayi2);

        System.out.println(a+b);

    }




    }

