package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //****
        //****
        //****
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        System.out.println("Karakter seciniz");
        char ch = input.next().charAt(0);


        for (int i = 1 ; i<=satir ; i++) {
            for( int j =1 ; j<=sutun  ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        */


        // Asagidaki sekli veren kodu yaziniz
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        for(int i=1; i<5 ; i++ ){

            for(int k = 1 ; k <= i ; k++){
                System.out.print(k+ " ");
            }
            System.out.println();

        }














    }
}
