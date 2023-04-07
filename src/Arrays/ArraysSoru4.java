package Arrays;

public class ArraysSoru4 {

   // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
   // olusturun.

    public static void main(String[] args) {

        String[] arr= {"isim","soyisim","telefon","adres","kimlikno"};
        EnUzunEnKisaKelimeBul(arr);
    }

    public static void EnUzunEnKisaKelimeBul(String[] arr) {
        String enKisa = arr[0];
        String enUzun = arr[1];

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].length() < enUzun.length()) ;
            enUzun = arr[i];

        }
        if (arr[i].length() < enKisa.length()) ;
        enUzun = arr[i];

        System.out.println("en uzun kelime:   "+enUzun+" \nen kisa kelime: "+enKisa);

    }

    }

