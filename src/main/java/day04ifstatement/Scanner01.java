package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
 //next() ile nextLine() methodlarinin farklari: next() kullanicidan gelen stringlerin sadece ilk kelimesini alir
        //ama nextLine() methodu kullanicidan gelen bütün stringleri alir.

        Scanner input = new Scanner(System.in);
        /*
        //1. Yol
        System.out.println("Ilk isminizi giriniz...");
        String ilkisim = input.next();   // next methodu kullanicidan string datasi almak icin kullanilir.

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNumarasi = input.next();

        System.out.println( ilkisim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNumarasi);

        //2.Yol

        System.out.println(" Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy  = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy );
        System.out.println(kimlik);
        */

        // 3.Yol

        System.out.println("Ilk , orta ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);




    }
    /* Kullanicidan ilk orta ve soy ismini kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
    Ali Mert Can
    123456789
     */
}
