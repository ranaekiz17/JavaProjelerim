package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ArrayList {
    public static void main(String[] args) {

       // Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
       // bir liste olarak bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(FibonacciSayi(sayi));
    }

    public static List<Integer> FibonacciSayi(int sayi) {

        List<Integer> yenilist = new ArrayList<>();

       // yenilist.add(0);
       // yenilist.add(1);

        int a=0;
        int b=1;

        yenilist.add(a);
        yenilist.add(b);

        for (int i = 2; i <sayi; i++) {

            int c = a+b;
            if (c< sayi){
                a=b;
                b=c;
                yenilist.add(c);
            }

            }


        return yenilist;
    }

    }

