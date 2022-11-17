package day27exceptions;

import java.sql.SQLOutput;

public class Exceptions01 {

    public static void main(String[] args) {

       double r1=  compareNumOfCharacters("Java","xy");
        System.out.println(r1);

        double r2= compareNumOfCharacters(null,"xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3);

    }
//Verilen iki Stringden birinin karakter sayisinin digerinin kac kat oldugunu bulan method bulusturunuz

    public static double compareNumOfCharacters(String s, String t) {

        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("length() methodu null ile kullanilamaz");
        } catch (ArithmeticException E) {
            System.out.println("Herhangi bir sayi o ile bölnemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        return result;
    }
}
/*
  "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.

    Java'da birbirine benzeyen üç tane keyword var:
    "final", "finally", "finalize" açıklayınız
    1)"final" bir keyword'dür. Variable, Class ve Method'lar için kullanılır.
    2)"finally" bir "code block" dur.
      "try-catch" veya sadece "try" ile kullanılır.
      "finally" code block içine yazılan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir eylemdir. Bunu "finally" ile yapabiliriz.
    3)"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
      imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.
        "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.

 */




}
