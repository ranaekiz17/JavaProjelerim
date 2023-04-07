package deneme01_question;

import java.util.Scanner;

public class C06_ifStatements3 {

    public static void main(String[] args) {

        // 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdiri

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char ckr= scan.next().charAt(0);

        if (ckr >= 'a'&& ckr<= 'z'){
            System.out.println(Character.toUpperCase(ckr));

        } else {
            System.out.println("Girilen karakter buyuk harf ");

        }
    }
}
