package Arrays;

public class ARR {

    public static void main(String[] args) {

       //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int []arr = {2,6,9,7,8};

        System.out.println(ArrElemanTopla(arr));
        int toplam = ArrElemanTopla(arr);
        System.out.println(toplam);
    }

    public static int ArrElemanTopla(int[] arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                toplam+= arr[i];
            }

        }return toplam;
    }
}
