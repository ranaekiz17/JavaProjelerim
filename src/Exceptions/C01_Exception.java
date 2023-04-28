package Exceptions;

public class C01_Exception {

    public static void main(String[] args) {


            String a = null;
            String b ="";

            try{

                int c = a.length()+ b.length();
                //   throw new RuntimeException();


            } catch (NullPointerException e) {
                System.out.println("null poınter dir uzunlugu olmaz");

            }catch (RuntimeException e ){
                System.out.println("throw keyword");
            }

        }
    }

