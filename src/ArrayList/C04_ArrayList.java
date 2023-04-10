package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_ArrayList {

    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane Fibonacci
       // sayisini bir list olarak donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(Fibonacci(sayi));
    }

    public static List<Integer>  Fibonacci(int sayi) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        for (int i = 2; i <sayi ; i++) {
            list.add(list.get(i-2)+ list.get(i-1));

        }
        return list;

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scan.nextInt();

        List<Integer>fibonacciSayisi= fibonacciListesi(sayi);

        System.out.println(fibonacciSayisi);


    }

    public static List<Integer> fibonacciListesi(int sayi) {

        List<Integer> list = new ArrayList<>();

        int a=0;
        int b=1;
        int c=a+b;

        list.add(a);
        list.add(b);

        while (c < sayi){

            list.add(c);

            a=b;
            b=c;
            c=a+b;

         */
    }
}
