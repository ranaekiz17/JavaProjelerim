package ForLoop_WhileLoopCalisma;

import java.util.Scanner;

public class doWhieLoop {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int flag =0;


        for (int i = 1; i <sayi ; i++) {
            if (i*i == sayi){
                flag++;
                System.out.println(i +"\n  true " );
            }

        }if (flag== 0){
            System.out.println("false");
        }


        /*
        int flag = 0;
        int a = 1;
        while (a<sayi) {

            if (a * a == sayi) {
                flag++;
                System.out.println(a + "\ntrue");

            }
            a++;

        }
        if (flag == 0) {
            System.out.println("false");
         */

        }



    }

