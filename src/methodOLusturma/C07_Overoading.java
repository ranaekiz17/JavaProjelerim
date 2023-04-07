package methodOLusturma;

public class C07_Overoading {

    public static void main(String[] args) {

        // verilen birden buyuk bir tam sayi icin
        // sayi asal ise true
        // sayi asal degil ise false donen bir metod olusturun

        System.out.println(isAsal(23)); // True
        System.out.println(isAsal(2));
        System.out.println(isAsal(45));
    }


    public static boolean isAsal(int sayi) {

        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
                break;

            }
        }

            if(sayi == 2) {
                return true;

            } else
            if (sayac == 0) {
                return true;


            } else {
              return false;
            }
        }



    }


