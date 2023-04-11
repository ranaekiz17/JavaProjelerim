package ForEachLoop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;


public class C01_ForEachLoop {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin

        int[] sayi = {2,6,8,1,2,3,2,6};


        List<Integer> yenilist = new ArrayList<>();

        for (int each:sayi
             ) {
            if(! yenilist.contains(each)){
                yenilist.add(each);
            }
        }

        int [] yeniarr = new int[yenilist.size()];


        for (int i = 0; i < yenilist.size(); i++) {
            yeniarr[i]=yenilist.get(i);

        }


        System.out.println (Arrays.toString(yeniarr));
    }
}
