package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_ArrayList {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(TamBolebilen(sayi));

    }

    public static List<Integer> TamBolebilen(int sayi) {

        List<Integer> yenilist = new ArrayList<>();
        for (int i = 1; i <= sayi ; i++) {
            if(sayi%i ==0){
                yenilist.add(i);
            }

        }
        return yenilist;
    }
}
