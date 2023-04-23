package StaticKeywords_PassByValue;

public class PassByValue_1 {

    public static void main(String[] args) {

        double fiyat =200;

       indirimYap10(fiyat);
       System.out.println(fiyat);
       indirimYap25(fiyat);
       System.out.println(fiyat);
    }

    public static void indirimYap10(double fiyat){  // local variable ---- double fiyat = degeri method'un
        // cagrildigi yerden gelir

        fiyat = fiyat * 0.9;

        System.out.println("%10 indirimli fiyat:"  + fiyat);

    }

    public static void indirimYap25(double fiyat){

        fiyat = fiyat * 0.75;

        System.out.println("%25 indirimli fiyat:"  + fiyat);
    }
}
