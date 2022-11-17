package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Example1  Kullanicidan gün isimlerini aliniz . O günün haftasonu mu hafta icimi oldugunu kullaniciya söyleyiniz
        //Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        //Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
        //    i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
        //    ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gün = input.next();

        //1.Yol
        if(gün.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu...");
        }else if(gün.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta ici...");
        }else if(gün.equalsIgnoreCase("Sali")){
            System.out.println("Hafta ici...");
        }else if(gün.equalsIgnoreCase("Carsamba")){
            System.out.println("Hafta ici...");
        }else if(gün.equalsIgnoreCase("Persembe")){
            System.out.println("Hafta ici...");
        }else if(gün.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else if(gün.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else {
            System.out.println("Gecerli bir gün ismi giriniz...Sali");
        }
        //2.YOL
        if(gün.equalsIgnoreCase("Pazar") || gün.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta Sonu");
        } else if (gün.equalsIgnoreCase("Pazartesi")||
                   gün.equalsIgnoreCase("Sali") ||
                   gün.equalsIgnoreCase("Carsamba") ||
                   gün.equalsIgnoreCase("Persembe") ||
                   gün.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //3.YOL
        boolean haftaSonu = gün.equalsIgnoreCase("Pazar") || gün.equalsIgnoreCase("Cumartesi");

        boolean haftaIci= gün.equalsIgnoreCase("Pazartesi")||
                          gün.equalsIgnoreCase("Sali") ||
                          gün.equalsIgnoreCase("Carsamba") ||
                          gün.equalsIgnoreCase("Persembe") ||
                          gün.equalsIgnoreCase("Cuma");
        if(haftaSonu){
            System.out.println("Hafta Sonu");
        } else if (haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
    }
}
