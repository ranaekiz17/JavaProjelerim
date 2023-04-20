package Mutable_Immutable;

public class Immutable {

    public static void main(String[] args) {

        String isim ="Rana";

        System.out.println(isim.toUpperCase());
        System.out.println(isim);


        isim = isim.toUpperCase();
        System.out.println(isim);

    }
}
