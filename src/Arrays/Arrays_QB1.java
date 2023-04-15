package Arrays;

public class Arrays_QB1 {

    public static void main(String[] args) {

        //String’ lerden oluşan bir arrayde kullanılan ögelerin toplam karakter sayısını bulunuz.
        //Ornek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" }

        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum = 0;
        for(String w : b){
            sum = sum + w.length();
        }
        System.out.println("Total number of characters is " + sum);

    }

}
