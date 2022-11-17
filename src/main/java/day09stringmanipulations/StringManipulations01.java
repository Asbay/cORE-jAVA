package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Kara kara düsünme Ankara";
        //indexOf() methodu verilen karakter veya karakterlerin ilk görünümünün indexini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        //lastIndexOf() methodu
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";
        int s1 = s.indexOf('i');  //indexOf() hem string hemde char ile kullanilabilir.
        System.out.println(s1); // 1 verdi.

        int s2 = s.indexOf("iss");       // ilk görünümün "ilk" karakterinin indexini verir
        int s3 = s.lastIndexOf("iss");   // son görünümün "ilk" karakterinin indexini verir.
        System.out.println(s2);
        System.out.println(s3);

        //Example 1 : Bir Stringdeki bir karakterin  tekrarli veya tekrarsiz olup olmadigini gösteren kodu yaziniz.
        // "Helloooo" ==> H => tekrarsiz  e=> tekrarsiz l=> tekrarli o => tekrarli

        String t = "Helloooo";

        if(t.indexOf('H')== t.lastIndexOf('H')){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci paramatrede verilen sayi kadar karakteri gectikten sonra istenen karakterin
        // ilk görünümünün indexini return eder

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en bastan bu indexe kadar
        //olan karakterleri bir kutu icine aliniz ve lastIndexOf methodunu sadece bu kutu icindeki string icin kullaniniz

        int sonuc = u.indexOf("n", 5);
        System.out.println(sonuc);
        String m ="Hello everyone";
        int e = m.lastIndexOf("e", 5);
        System.out.println(e);

// isEmpty() methodu bir Stringin bos olup olmadigini kontrol eder.
        //Eger Stringde hic karakter yoksa isEmpty() "true" return eder, herhangi bir krakter varsa "false" return eder
        // length()==0 demek isEmpty() true verir demektir.
        //
        String v = " ";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        //isBlank() hem bos String icin hem de space iceren Stringler icin true return eder.
        String x = "   ";
        boolean blankmi = x.isBlank();
        System.out.println(blankmi);

        //Example 2 : Kullanicidan alinan isim mutlaka spaceden farkli en az 1 karakter icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz ");
        String ilk = input.nextLine();

        if( ilk.isBlank()){
            System.out.println("sana ismini gir dedim");
        }else{
            System.out.println(ilk);
        }



    }
}
