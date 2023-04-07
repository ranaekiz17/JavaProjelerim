package C01_Switch;

import java.util.Scanner;

public class C01_Switch {

    //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
    //ve girilen harfin karsiligini yazdirin.
    //I : International S : Software T : Testing Q : Qualifications B: Board


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamını gormek istediginiz harfi giriniz");

        char kisaltmaAnlam = scan.next().toUpperCase().charAt(0);

        switch (kisaltmaAnlam){
            case 'I' :
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
        }
    }

    }


