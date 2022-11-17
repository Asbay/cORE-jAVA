package day03typecastingwrappersscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Toplama islemi yapan sayilari alicidan alan ve toplama islemi yapan kodu yaziniz

        //1.adim scanner classindan obje olustur
        Scanner input = new Scanner(System.in);

        //2. adim: kullaniciya ne yapacagini söyle
        System.out.println("ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2 );
    }
}
