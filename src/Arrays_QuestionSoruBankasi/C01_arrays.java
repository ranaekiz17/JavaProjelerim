package Arrays_QuestionSoruBankasi;

public class C01_arrays {

    public static void main(String[] args) {


       // String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String [] isimler = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        String enKisa = isimler[0];
        String enUzun = isimler[0];

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler [i].length()<= enKisa.length()){

                enKisa = isimler[i];
            }if(isimler [i].length()> enUzun.length()){

                enUzun = isimler[i];
            }

        }


        System.out.println(enKisa);
        System.out.println(enUzun);











    }
}
