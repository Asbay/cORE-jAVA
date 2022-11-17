package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // bir stringdeki sesli harflerin sayisini bulan kodu yaziniz
        // a e i o u, A E I O U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        String harfler [] = str.split("");
        str = str.toLowerCase();
        System.out.println(Arrays.toString(harfler));
        // cevapta bunu verdi
        // [J, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .]

        int counter = 0;

        for( String w : harfler){
            //3den fazla ihtimal oldugunda switch kullanmak tercih edilir

            switch (w){
                case "a":
                case"e":
                case "i":
                case"o":
                case"u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
