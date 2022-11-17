package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /* Password un ilk harfi büyük harf ise
        'A' olursa gecerli Password aksi halde gecersiz Password.

        Password un ilk harfi kücük harf ise
         'z' olursa gecerli Password aksi halde gecersiz Password.

         bu verilen senaryo ama eksik olan kisim kullanici harf disinda sayi girerse kod calismaz o yuzden o ihtimalide
         en sona eklemek gerekir.
         Note: Java nested kodlari calistirirken cok zaman harcar buna time complexity denir bu yüzden mümkünse nested
         kullanmamaya calisiriz.
         */

        String pwd ="5xy12!";

        char ilkHarf = pwd.charAt(0);
        // burasi ilk kisim icin yazilan bölüm
        if(ilkHarf>= 'A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }
        }else if(ilkHarf>='a'&& ilkHarf<='z'){
            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else {
            System.out.println("ilk karakter harf olmalidir...");
        }
    }
}
