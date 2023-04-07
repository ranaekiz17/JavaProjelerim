package ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ArrayList {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun.

        System.out.println(isimListele());

    }

        public static List<String> isimListele (){

            ArrayList<String> yenilist = new ArrayList<>();



                String isim = "";
            while (! isim.equalsIgnoreCase("q")){
                System.out.println("lutfen bir isim giriniz,\nisleminizi bitirmek icin Q'ya basiniz");
                isim = scan.nextLine();


                if (! isim.equalsIgnoreCase("q")){
                    yenilist.add(isim);
            }


            }
            return yenilist;
        }
    }

