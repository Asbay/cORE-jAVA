package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      /*  int sayi = 0;
        do{
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if(sayi <100){
                System.out.println("Kazandiniz");
            }
        } while (sayi < 100);
        System.out.println("Kaybettiniz");

*/
        //Example 2 :Kullanicidan ismler aliniz ilk harfiin büyük olup olmadigini kontrol ediniz


        do {
            System.out.println("Isminizi giriniz");
            char ilkHarf = input.next().charAt(0);
            if(ilkHarf >= 'A' && ilkHarf <= 'Z'){
                System.out.println("Ismi basariyla girdiniz");
            }else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }
        }while(true);

        /* Infinite Loop: Sonsuz döngü
        artirma azaltma kisminda hata yaparsaniz infinite loop sorunali olusur.
         ornek : for( int i= 1; i<4 ; i--){
                 System.out.println("Hi");
                  }
                  artirma azaltma kismini yazmazsak gene infinie loop sorunsali olusur
         ornek : for(int i = 1; i<4 ; ) {
                System.out.println("Hi");
                }

           ornek: int i = 12;
                while(i<15){
                 System.out.println("Hi");
                 }








        */
    }
}
