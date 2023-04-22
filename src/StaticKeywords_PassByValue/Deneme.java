package StaticKeywords_PassByValue;

public class Deneme {

    static int sayi =20;
    static int yas = 15;

    public Deneme(){

    }


    public void method1(){
        sayi++;
        yas++;

    }


    public static void main(String[] args) {

        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme();
        System.out.println(obj2.sayi+"," +obj1.yas);


    }
}



