package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2022;
        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);
        /*
        Asagidaki kurallara göre passwordun gecerli olup olmadigini kontrol eden kodu yaziniz.
        1- 8 karakterden fazla veya 8 karakter varsa ilk harfi kücük 'i' olmalidir
        2- 8 karakterden az karakter varsa ilk harfi 'K' olmalidir
         */
        String pwd = "K2a3ed54";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K'? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli": "Gecersiz");
        System.out.println(gecerli);

    }
}
