package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example1 : Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiiniz.
        //Ramazan Rn

        Scanner input = new Scanner(System.in);
       /* System.out.println("Lutfen isminizi giriniz..");
        String isim =input.next();

        char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length()-1);

        System.out.println( "" + ilkHarf + sonHarf);


        //2.Yol
        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);
        System.out.println(ilk + son);

        //Example 2: Asagidaki verilen Stringdeki tum hayvan isimlerini ekrana yazdiriniz...
        //   "Ben kedi esim tavuk oglum sever inek"
        String str = "Ben kedi; esim tavuk, oglum sever inek";

         //substring in iki kullanimi vardir
        //1) Substring (baslangic indexi, bitis indexi) Stringin ortasindan bir parca almaya yarar.
        //2)  Substring(baslangic indexi) Stringin verilen indexten sonuna kadar almaya yarar.
        String kedi = str.substring(4, 8 );
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);

        System.out.println(kedi+tavuk+inek);
*/
        //Example 3 : ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz.
        // Ali Can ==> AC   Tahsin Yur ==>

        System.out.println("Ilk ve Soy isminizi giriniz...");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);









    }
}
