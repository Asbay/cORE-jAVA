package day03typecastingwrappersscanner;

import java.util.Scanner;

public class Scanner01 {
    //Scanner kullanicidan data almaya yarar. Scanner kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir java class idir. Bu Classi kullanabilmek icin import etmek gerekir.
    //Scanner class i javanin util kütüphanesindedir.

    public static void main(String[] args) {

         //Kullanicidan data almak icin yapilmasi gerekenler
        //1, adim Scanner Classindan object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim kullaniciya ne yapacagini söyle
        System.out.println("Hey kullanici yasini gir");

        //3.adim: kullanicidan alinan data yi bir variablenin icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " +  age );

    }
}
