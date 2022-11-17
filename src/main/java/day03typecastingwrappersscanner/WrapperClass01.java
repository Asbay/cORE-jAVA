package day03typecastingwrappersscanner;

public class WrapperClass01 {

    public static void main(String[] args) {
        /*
        java primitivlere methodlar ekleyerek yeni bir yapi olusturdu, bu yapiya "Wrapper Class" denir
        Primitive   wrapper
        byte    ==>     Byte
        short   ==>     Short
        int     ==>     Integer
        long    ==>     Long
        float   ==>     Float
        double  ==>     Double
        boolean ==>      Boolean
        char    ==>      Character

        */

        byte primitiveByte = 12; //primitiveByte yazip nokta koydugumuzda hic method göremeyiz.
        // cünkü primitiveler method icermez deger icerir


        Byte wrapperByte  = 12;
        // wrapperByte yazip nokta koydugumuzda bir cok method görürüz cünkü wrapperlar bir cok method icerir.

        //Example: byte data type inin en kücük ve en büyük degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Example2: short int long data typelarinin en büyük ve en kücük degerlerini ekranan yazdiriniz.
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //primitiveler nasil wrapperlara cevrilir (Autoboxing)
        float f1 = 13.99F;
        Float wrapperf1 = f1;

        //Wrapperlar nasil "primitivelere" cevrilirler(Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.

    }
}
