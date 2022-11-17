package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 : Bir Stringdeki space haric kac tane karakter kullanildigini gösteren kodu yaziniz
        //Ali okula gitti ==> 14

        String str = "Ali okula gitti.";

        //replace() methodu bir Stringdeki herhandi bir karakteri veya karakterleri dgistirmek icin kullanir
        int num = str.replace(" ", "").length();
        System.out.println(num);

        // Example 2 : Bir String deki tum 'a' harflerini 'A' ya ceviriniz
        String s = " Ankara'nin tasina gözlerimin yasina bak.";

        String yeni = s.replace("a", "A");
        System.out.println(yeni);

        // Example 3 : Bir String deki "kara kelimelerinin yerine "*" koyunuz

        String p = "Kara kara düsünme Ankara";
        String pkara = p.replace("kara", "*");
        System.out.println(pkara);     //Kara * düsünme An*

        //Example 4 : Bir String'deki tüm sayilari "*" a ceviriniz
        // "AC202117004" == AC*********
        String stdId = "AC202117004";
        String yenistdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yenistdId);

        /*
        Bir grup data yi ifade eden kodlara "Regex" denir
        "Regex" Regular Expressions in ksaltilmis halidir.
         Tum rakamlari ifade etmek icin [0-9]
         Tum kucuk harfler [a-z]
         Tum büyük harfler [A-Z]
         Tüm Harfler ==> [a-zA-Z]
         Sesli Harfler ==> [aeiouAEIOU]Space karakteri ==> [ ]
         Tumrakamlar ve tum harfler ==> [0-9a-zA-Z]
         Tum noktalama isaretleri ==> \\p{Punct}

         Rakamlar haric tum karakterler ==> [^0-9]
         Kücük harfler haric tum karakterler ==> [^a-z]
         Buyuk harfler haric tüm karakterler ==> [^A-Z]
         tum harfler haric tum karakterler ==> [^a-zA-Z]
         Space haric ==> [^ ]

         */

        //Example 5 : Verilen bir Stringde kullanilan noktalama isareti ve rakamlar ve space karakteri haric tum karakterlerin
        // sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma !...";
        int yeniU= u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(yeniU);

        // Example 6: Bir password un gecerli olup olmadigini asagidaki kurallara göre test eden kodu yaziniz.
        // i) Space haric en az sekiz karakter olmali
        //   ii) En az bir sembol icermeli
        //  iii) En az bir rakam icermeli
        // iv) en az 1 büyük harf icermeli
        // v) En az 1 kücük harf icermeli

        String pwd = "B78c? K!m";
        boolean first = pwd.replace(" ","").length()>7;    // i) Space haric en az sekiz karakter olmali
        boolean second = pwd.replaceAll("[0-9a-zA-z ]","").length()>0;  //   ii) En az bir sembol icermeli
       boolean third = pwd.replaceAll("[^0-9]","").length()>0;      //  iii) En az bir rakam icermeli
       boolean fourth=  pwd.replaceAll("[^A-Z]","").length()>0;  // iv) en az 1 büyük harf icermeli
        boolean fifth = pwd.replaceAll("[^a-c]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;
        if (pwdGecerli){
            System.out.println("Passwordunuz gecerli..");
        }else {
            System.out.println("Passwordunuz gecerli degildir..");
        }

        //Example7 : Bir String deki noktalama isaretlerinin sayisini gosteren kodu yaziniz.

        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();

        System.out.println(number);




        //Example 8: verlien bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika " yazdirin
        //aksi halde normal yazdirin

        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);






















    }
}