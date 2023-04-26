package Varargs;

public class Varargs {

    public static void main(String[] args) {

     topla(3,4);
     topla(3,4,5);


    }

    public static  void topla (int ... a ){

        int toplam = 0;

        for (int each:a
             ) {
            toplam+= each;
        }

        System.out.println("verilen sayilarin toplami :"  + toplam ) ;
    }
}
