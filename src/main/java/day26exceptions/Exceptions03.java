package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

     double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d); //41.0

        divideStringByTheNumOfTheChar(null);
    }

    //Stringdeki karakter sayisini bulan bir method olusturunuz. Stirng i Integer a ceviriniz sonrada Integer i karakter sayisina bölünüz

    public static double divideStringByTheNumOfTheChar(String str){
        int length=0;
        int i =0;
        double sonuc =0;
        try{

       length =str.length();
        i =Integer.valueOf(str);//NumberFormatException: Eğer içinde rakamdan farklı karakter barındıran bir String'i
        //                       valueOf() kullanarak Integer'a çevirmek isterseniz NUmberFormatException alırsınız
        sonuc =i/length;

    }catch(NullPointerException e){

            System.out.println(e.getMessage());
        }catch(NumberFormatException e){

            System.out.println(e.getMessage());
        }catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    public static double divideStringByTheNumOfTheCharacter(String str) {
        int length=0;
        int i =0;
        double sonuc =0;
        try{

            length =str.length();    //NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i =Integer.valueOf(str);//NumberFormatException: Eğer içinde rakamdan farklı karakter barındıran bir String'i
            //                       valueOf() kullanarak Integer'a çevirmek isterseniz NUmberFormatException alırsınız
            sonuc =i/length;        //ArithmeticException: Bolen sayi sifir oldugunda alinir
    }catch (Exception e){

            System.out.println(e.getMessage());

        }return sonuc;
    }
    }
/*
    Note: 1) Aralarında "parent-child" relationship olan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             "child" olan önce kullanılmalıdır, aksi takdirde hata verir.
          2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.

 */
