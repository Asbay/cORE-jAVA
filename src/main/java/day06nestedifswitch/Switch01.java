package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {
        /*  Kullanicidan gün sayisini aliniz ve gün ismini ekrana yazdiriniz.

        1==> Pazar

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasini giriniz");

        byte günNo = input.nextByte();
        //1.Yol if ile cözünüz
        if(günNo==1){
            System.out.println("Pazar");
        }else if(günNo==2){
            System.out.println("Pazartesi");
        } else if(günNo==3){
            System.out.println("Sali");
        }else if(günNo==4){
            System.out.println("Carsamba");
        }else if(günNo==5){
            System.out.println("Persembe");
        }else if(günNo==6){
            System.out.println("Cuma");
        }else if(günNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli gün sayisi giriniz...");
        }
        //2.Yol switch ile cözünüz  break burda durum tamamlandigi zaman birak demek digerlerini arastirmaz.
        switch (günNo){

            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gün sayisi giriniz...");
        }

    }
    }

