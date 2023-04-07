package calısmaSayfası_01;

public class deneme_02 {
    public static void main(String[] args) {


        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen

        int a = 6;
        int b = 6;
        int c = 6;

        if (a == b && b == c ) {

            System.out.println(" eskenar ucgen ");

        } else if (a == b && b != c || a == c && b != c || b == c && a != c  ) {
            //(a == b && b != c || a == c && b != c || b == c && a != c )

            System.out.println("ikizkenar ucgen");
        } else {
            System.out.println("cesitkenar ucgen");
        }


    }

}
