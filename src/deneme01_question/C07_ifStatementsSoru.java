package deneme01_question;

import java.util.Scanner;

public class C07_ifStatementsSoru {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanicidan uc kenar giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c && c > 0 ){
            System.out.println("Eskenar Ucgen");
        }
        else {
            System.out.println("Eskenar ucgen degil");
    }

}
}