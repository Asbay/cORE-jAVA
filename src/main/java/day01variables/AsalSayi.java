package day01variables;

import java.util.ArrayList;
import java.util.List;

public class AsalSayi {
    /* İlk altı asal sayıyı listeleyerek: 2, 3, 5, 7, 11 ve 13, 6. asal
    sayının 13 olduğunu görebiliriz.
            10001. asal sayı kaçtır?
    */
    public static void main(String[] args) {

        int sayac = 0;
        List<Integer> arr= new ArrayList<>();
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+" ");
                sayac++;
            }
        }
    }
}




