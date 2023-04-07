package methodOLusturma;

public class C05_mETHODoLUSTURMA {

    public static void main(String[] args) {

        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        String metin = "Kabak";

        String tersMetin = C04_methodOlusturma.stringiTersineCevirme(metin);

        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Girilen metin Palindrom");
        }else {
            System.out.println("Girilen metin Palindrom degildir");
        }

        }
    }
