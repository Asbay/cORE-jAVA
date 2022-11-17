package day01variables;

import java.util.Scanner;

public class EnBüyükAsalCarpniBulma {
    /*
    13195'in asal çarpanları 5, 7, 13 ve 29'dur.
    600851475143 sayısının en büyük asal çarpanı kaçtır?

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = input.nextInt();

        for(int i=2; i<sayi; i++){
            if(sayi%i ==0){
                if (i%i==0 && i%1==0){
                    System.out.print(i+ " ");
                }
            }
        }
    }

}