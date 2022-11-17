package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

        /*String CLASS methodlarini ögrenecegiz
        1) equals() methodu : i)Iki tane Stringin ayni olup olmadigini anlamamiza yarar.
                              ii) equals() methodu "booleam" return eder.
       2) equlsIgnoreCase(): i) Iki tane String in ayni olup olmadigini büyük harf kücük harfe dikkat etmeden anlamamiza yarar
                             ii) equalsIgnoreCase() methodu "boolean" return eder.

       3) toLowerCase(): i) Bir Stringdeki tün harfleri kücük harfe cevirmek icin kullanilir
                         ii) toLowerCase methodu "String" return eder.

      4) toUpperCase: i) Bir Stringdeki tüm harfleri büyük harfe cevirmek icin kullanilir.
                      ii) toUpperCase methodu "String" return eder.

     5) charAt()     i)Bir Stringden belli bir index deki karakterleri almak icin kullanilir
                     ii) charAt() methodu "char" return eder.

     6) length()     i) Bir Stringde kac tane karakter kullanildigini ogrenmek icin kullanilirä
                     ii) length() methodu "int" return eder.

     7) contains()   i) Bir Stringde belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir
                     ii) contains() methodu "boolean" return eder.

     8) split("") i) Bir Stringi istedigimiz karakterden parcalamaya yarar. splitte kullanilan karakter soncta görünmez
                  ii) Split() methodu "Array" return eder.

              /*
              Bir passwordun gecerli olup olmadigini asagidaki kurallara göre kontrol eden kodu yaziniz
                1) En az 8 karakter icermeli
                2)Space karakteri icermemeli
                3) ilk Harfi "M" veya "m"  olmali
                4)son Karakteri "?" olmali
         */
         String pwd = "Manis12?";
         boolean first = pwd.length()>7;       //1) En az 8 karakter icermeli
        boolean second = !pwd.contains(" ");        //2)bastaki  ünlem olumsuzluk yani pwd nin icinde bosluk yok demek
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)== 'm';       //3)ilk Harfi "M" veya "m"  olmali
        boolean fourth = pwd.charAt(pwd.length()-1)== '?';      //4)son Karakteri "?" olmali
        System.out.println(first && second && third && fourth); // hepsi birden dogruysa password gecerli olucak o yuzden and kullanilir
    }
}
