package day03typecastingwrappersscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric Data Typeini diger bir numeric Data Type ina cevirmek demektir.
    //        byte < short < int < long < float < double
    // Kücük Data type ini büyük Data Typena cevirmeye "auto widening" denir
    // Büyük Data Type ini kücük Data Type ina cevirmeye "Explicit Narrowing" denir

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1 : shortu double a ceviren kodu yaziniz.
        // floati byte yapan kodu yaziniz.

        short ase =235;
        double newAse = ase;

        float price=  12.99F ;
        byte newAsl= (byte)price ;

        System.out.println(newAsl);  // burda sonuc 12 geldi, Java ondalik sayiyi , tam sayiya cevirirken yuvarlama islemi yapmaz
                                     // Java ondalik sayiyi, tam sayiya cevirirken ondalik kismi siler.
        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);

        byte byteTipi = 15;
        short shortTipi = byteTipi;
        System.out.println("byte dan short tipine otomatik tip dönüşümü sonucu : " + shortTipi);  //byte dan short tipine otomatik tip dönüşümü sonucu : 15
        int intTipi = shortTipi;
        System.out.println("short dan int tipine otomatik tip dönüşümü sonucu : " + intTipi);  //short dan int tipine otomatik tip dönüşümü sonucu : 15
        long longTipi = intTipi;
        System.out.println("int den long tipine otomatik tip dönüşümü sonucu : " + longTipi);  //int den long tipine otomatik tip dönüşümü sonucu : 15
        float floatTipi = longTipi;
        System.out.println("long dan float tipine otomatik tip dönüşümü sonucu : " + floatTipi);  //long dan float tipine otomatik tip dönüşümü sonucu : 15.0
        double doubleTipi = floatTipi;
        System.out.println("float dan double tipine otomatik tip dönüşümü sonucu : " + doubleTipi);  //float dan double tipine otomatik tip dönüşümü sonucu : 15.0

        double doubleVeri = 12723.12;
        float doubleToFloat = (float) doubleVeri;
        System.out.println("double veri türünden float Veri Türüne Casting :"+doubleToFloat);  //double veri türünden float Veri Türüne Casting :12723.12

        long longVeri = 32654;
        int longToInt = (int) longVeri;
        System.out.println("long veri türünden int Veri Türüne Casting :"+longToInt);   //   long veri türünden int Veri Türüne Casting :32654

        int intVeri = 4587;
        short intToShort = (short) intVeri;
        System.out.println("int veri türünden short Veri Türüne Casting :"+intToShort);   // int veri türünden short Veri Türüne Casting :4587

        short shortVeri = 127;
        byte shortToByte = (byte) shortVeri;
        System.out.println("short veri türünden byte Veri Türüne Casting :"+shortToByte);    //int veri türünden float Veri Türüne Casting :127
//
    }
}
