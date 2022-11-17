package day03typecastingwrappersscanner;

import java.util.Scanner;

public class Scanner03 {


    public static void main(String[] args) {

         // kullanicidan bir dikdörtgenn en ve boyunu alip alan ve cevresini hesaplayan program yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kisa kenarini giriniz.");
        int en = input.nextInt();

        System.out.println("Dikdörtgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println("Dikdörtgenin cevresi= " + 2*(en+boy));
        System.out.println("Dikdörtgenin alani= " + en*boy);
    }
}
