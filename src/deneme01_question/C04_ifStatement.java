package deneme01_question;

import java.util.Scanner;

public class C04_ifStatement {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir not giriniz");

        int a = scan.nextInt();

        if (a>=50 && a<=100 ){
            System.out.println("Sinifi Gectin");
        }
        if (a < 50) {
            System.out.println("Maalesef kaldiniz");
        }
    }
}
