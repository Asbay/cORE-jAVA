package day01variables;

public class IkiSayiArasindakiDörtveAltiyaBölonebilenSayilar {

    //120'den 11'e kadar 4 ile bölünebilen ve 6 ile
// bölünebilen tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.

    public static void main(String[] args) {

        for(int i=120; i>11; i--){

            if(i%4 ==0 && i%6 ==0 ) {
                System.out.print(i+ " ");
            }
        }
    }
}
