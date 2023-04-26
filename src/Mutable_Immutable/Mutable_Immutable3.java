package Mutable_Immutable;

public class Mutable_Immutable3 {
    public static void main(String[] args) {

        String a ="";
        a +=2;
        a += 'c';
        a += false;

        if (a == "2cfalse"){     // parantez ici true kabul edilir

            System.out.println("==");

        }if(a.equals("2cfalse")){
            System.out.println("equals"); // equals
        }
        // ==
    }
}
