package ForLoop_WhileLoopCalisma;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // 50 ile 100 arasindaki (sinirlar dahil) sayilari toplayin

        int toplam = 0;
        int sayi = 50;

        while (sayi>=50 && sayi<=100){

            toplam += sayi;
            sayi++;


        }
        System.out.println("sayilarin toplamı:"  + toplam);

    }


}

