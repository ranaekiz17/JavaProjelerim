package methodOLusturma;

public class WhileLoop {

    public static void main(String[] args) {

       // While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
       // donduren bir method olusturun.

        String metin = " her sey guzel olacak ";

        System.out.println(stringiTersCevirme(metin));


    }


    public static String stringiTersCevirme (String metin){

        String tersMetin = " ";

        for (int i = metin.length()-1; i >0 ; i--) {

            tersMetin += metin.charAt(i);




        }



       return tersMetin;
    }
}
