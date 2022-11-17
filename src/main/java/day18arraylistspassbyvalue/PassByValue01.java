package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
    1) Java variable larin orjinal degerlerini korumak ister
    2) Variabla methodlar icinde kullanildiginda ,Java methodun icine orjinal degeri koymaz, o degerin kopyasini üretir
     ve methoda o kopyayi yollar. Method kopya ustunde degisiklik yapar dolayisiyla variabla"in orjinal degerini korumus olur.

     Note : Java pass by Value kullanir.
     Bazi programlama dilleri orjinal egeri koruma altina almamistir. Bu isi developerlara birakmistir.
     Bu tarz diller "Pass By Reference" kullanır.
     */
    public static void main(String[] args) {

        int x =5;   //gömlek
        System.out.println(x);

        //static method olan "main method" un icindeki hersey static olmalidir.
        change(x);   //ögrenci gömlegi
        System.out.println(x);  // gömlek

        int ucret = 100;
        int kopya = indirim(ucret);
        System.out.println(ucret);
        System.out.println(kopya);
    }
    public static void change(int a){

        System.out.println(a*3);
    }

    // void disindaki return type larda method body si icinde "return keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){

        return gomlekUcreti -10;
    }
}
