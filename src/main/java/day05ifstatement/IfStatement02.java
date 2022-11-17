package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 2: Kullanici numarasini girsin kod gün ismini yazsin.
        // 2==> pazartesi  5==> persembe

        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasini giriniz");
        byte gün = input.nextByte();

        if(gün == 1){
            System.out.println("Pazar");
        }else if(gün == 2){
            System.out.println("Pazartesi");
        }else if(gün == 3){
            System.out.println("Sali");
        }else if(gün == 4){
            System.out.println("Carsamba");
        }else if(gün == 5){
            System.out.println("Persembe");
        }else if(gün == 6){
            System.out.println("Cuma");
        }else if(gün == 7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gün numarasi giriniz...Gecerli gün numaralari 1,2,3,4,5,6,7 den birisidir.");
        }


    }
}
