import java.util.Scanner;

public class nestedIf {

    public static void main(String[] args) {

         /*
       Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
       oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin

          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir negatif veya pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayi pozitif bir sayidir");
            if (sayi%2 == 0) {
                System.out.println("Girilen sayi cift sayidir");


                } else if (sayi%2!= 0) {
                System.out.println("Girilen sayi 10'un kati bir sayidir");
            }
        }else if (sayi <0 ){
            System.out.println("Girilen sayi yanlıs bir sayidir");
        }

    }
}
