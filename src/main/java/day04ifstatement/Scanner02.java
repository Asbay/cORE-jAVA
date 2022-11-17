package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
   /*
   Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
     Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
      Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
    */


    public static void main(String[] args) {

        //Kullanicidan ilk ve soy ismini aliniz. Ilk ve Soy isminin ilk harflerini ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        /* System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next().charAt(0);

        System.out.println("Soy isminizi giriniz...");
        char soy = input.next().charAt(0);

        System.out.println("" + ilk + soy);         */

        //2.yol
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine(); // Ali Can

        /*char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf); */

        char ilkHarf= tamIsim.split(" ")[0].charAt(2);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi =tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);


    }


}
