package day11loops;

public class ForLoop01 {
    //Example 1: 3 den 6 a kadar tamsayıların toplamini bulan kodu yaziniz.
    public static void main(String[] args) {
//Note: System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        //System.out.println(sum); loop'un icine yazilirsa her bir lopp için "sum"in hangi degerlerini aldigini yazdirir.
        int sum =0;

        for(int i = 3; i<7 ; i++){

            sum = sum+i ;

        }
        System.out.println(sum);


        //Example 2: 6 dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz
        int car = 1;
        for(int k = 6; k>2 ; k--){
            car = car*k;
        }
        System.out.println(car);

        //Example 3 size verilen  bir tamsayinin rakamlari toplamini bulunuz
        int num =-7364;
        num = Math.abs(num);
        int sonuc = 0;

        for (int i = num; i>0 ;i = i /10 ){
            sonuc = sonuc + i%10;

        }

        System.out.println(sonuc);

        //Example 4 : size verilen bir stringi ters ceviren kodu yaziniz.
        //Concatenation

        String str = "ey edip adanada pide ye";
        String ters ="";

        for (int i= str.length()-1; i > -1 ;i--){
            char c = str.charAt(i);
             ters = ters +c ;
        }
        System.out.println(ters);

    }
}
