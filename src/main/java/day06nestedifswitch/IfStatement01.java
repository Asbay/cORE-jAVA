package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    //Type a code, get age from user and decide which stage on it
    //0 - 4 => baby
    //5 - 12 => child
    //13 - 20 => teenager
    //21 - 30 => adult
    //else (not expected age)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();

        if(yas<0 ){
            System.out.println("Gecerli yas giriniz...");
        }else if(yas<=4){
            System.out.println("Baby");
        }else if(yas<=12){
            System.out.println("Cocuk");
        }else if(yas<=20){
            System.out.println("Genc");
        }else if(yas<=30){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis Evre...");
        }
    }
}
