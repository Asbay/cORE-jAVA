package day04ifstatement;

import java.util.Random;

public class MathSinifi {

    public static void main(String[] args) {

                System.out.println("Ceil : "+Math.ceil(2.7));
                System.out.println("Floor : "+Math.floor(2.7));
                System.out.println("Max : "+Math.max(12,22));
                System.out.println("Min : "+Math.min(12,22));
                System.out.println("Sqrt : "+Math.sqrt(81));
                System.out.println("Pow : "+Math.pow(2,3));
                System.out.println("Round : "+Math.round(17.3));
                System.out.println("Round : "+Math.round(17.7));

        System.out.println("---------------");



        Random random = new Random();
        int sayi = random.nextInt();
        System.out.println(sayi);



        /*
        Bunu çalıştırdığımız zaman nasıl bir sonuç alacağımızı tahmin edin.
40-41-42-43-44 sayılarından birisi rastgele seçilecek.
nextInt(5)+40; kısmında +40 ile alt limiti, 5 ile de üst limiti belirledik. Yani 40’tan sonra 5 defa git.

nextInt(5)+40; kısmını nextInt(5)-40; şeklinde değiştirelim. Bu kez ne olacak? -40 ve -36 dahil olmak üzere bu aralıktaki sayılardan birisi rastgele seçilecek.
         */
        int sayi1 = random.nextInt(5)+40;
        System.out.println(sayi1);


      /*
      Kodu incelediğinizde bir önceki örneğimizi kullanmışız ama sadece 150 sayısını oraya eklediğimizi göreceksiniz.
      Bu onun 0’dan 150’e kadarki sayılardan rastgele birisini seç demek oluyor. 0 dahilken 150 dahil değil.
      Rastgele gelebilecek sayılar arasından 150’nin de gelme olasılığı olsun derseniz orayı 151 şeklinde düzenlemeniz gerek.
       */
        int sayi2 = random.nextInt(150);
        System.out.println(sayi2);



        /*
        Rastgele seçilecekler arasında float veya double bir değer almak istersek aşağıdaki gibi yapabiliriz.
        double için ise float sayi = random.nextFloat(); kısmını double sayi = random.nextDouble(); şeklinde değiştirebilirsiniz. Ama rastgele seçilecek olan değer 0-1 arasında olacak.
         */

        float sayi3 = random.nextFloat();
        System.out.println(sayi3);

        /*
        Ben üst limiti 1 değil de 100 yapmak istersem?
         */

        float sayi4 = random.nextFloat()*100;
        System.out.println(sayi4);


/*
Çıktısı 5.0 dahil olmak üzere 15.0‘a kadarki float değerlerden birisi rastgele seçilecek.
 */


        float sayi5 = (random.nextFloat()*10)+5;
        System.out.println(sayi5);


        /*
        2 zar aynı anda atılsın.
zarların toplamı 5 veya 12 ise KAZANDINIZ mesajı verilsin.
Kişinin 10 deneme hakkı olsun. NOT: bu koşul if ile halledilsin.
         */

        int toplam = 0;
        int deneme = 1;

        while (true) {
            int zar1 = random.nextInt(6)+1;
            int zar2 = random.nextInt(6)+1;

            toplam = zar1 + zar2;


            if (toplam == 5 || toplam == 12){
                System.out.println(deneme+". denemede KAZANDINIZ");
                break;
            } else if (deneme == 10){
                break;
            } else {
                System.out.println(deneme+". deneme başarısız.");
            }
            deneme++;
        }
            }

}
