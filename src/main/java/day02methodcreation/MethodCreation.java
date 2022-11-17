package day02methodcreation;

public class MethodCreation {

        // main method icinde kullanacaginiz hersey static olmalidir. o yuzden alttaki methodlarin hepsinde static olmamsi lazim.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println( ucSayiyiCarp(2,1.5,6));
        System.out.println(toplaCarp(3,1.5,2));
   // sout yazip entera basarsak System.out.println otamatik olarak yazilir
        // ekrana bisey yazdirmak icin iki turlu kod var i) System.out.println()  ii) System.out.print()

        MethodCreation obj = new MethodCreation();
    }

    //Example 1: Toplama islemi yapan bir method olusturalim
    public static double toplamaYap (double a, double b) {

        return a+b;
    }
    //Example 2: 3 sayiyi birbiri ile carpan method
    public static double ucSayiyiCarp (double x, double y, double z){

        return x*y*z;

    }
    //Example 3: 3 sayidan ilk ikisini toplayip 3. ile carpan method olustur. Sonucu ekrana yazdir.

    public static double toplaCarp (double k, double l, double m ){

        return (k+l)*m;

    }
}
