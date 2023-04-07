package methodOLusturma;

public class C10_whileLoop {





    public static void main(String[] args) {


        // Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        // donduren bir method olusturun.


        System.out.println(tersMetinMetodu("Gulsum"));


    }

    public static String tersMetinMetodu(String metin) {

         String tersMetin= "";
         int i  = metin.length()-1;

         while (i >= 0 ){
             tersMetin+= metin.charAt(i);
             i--;
         }


        return tersMetin;
    }


}

 //public static String tersCevir(String str) {
//    String tersi = "";
//    int i = str.length() - 1;
//    while (i >= 0) {
//        tersi += str.charAt(i);
//        i--;
//    }
//    return tersi;