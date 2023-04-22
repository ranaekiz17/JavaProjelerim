package StaticKeywords_PassByValue;

public class C02_staticBlocks {


    C02_staticBlocks(){

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Java Candır");



        C02_staticBlocks obj1 =new C02_staticBlocks();
    }

    static {
        System.out.println("Java Guzeldir");
    }

    {
        System.out.println("Java Caba İster");
    }
}
