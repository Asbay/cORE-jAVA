package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example : verilen bir Listteki elemanlari tekrarsiz olarak yaziniz.
        // mesela [2,3,2,2,5]  ==> [2, 3, 5]
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for(Integer w: a){

            if(!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);    //[2, 3, 5]

        //Example 2: Kullanicidan bir harf aliniz Harf sizdeki Listin icinde varsa o harfi "Bulundu " ya ceviriniz
        // yoksa o harfi Liste ekleyiniz. Mesela :  [A, K, R, S] ==>  kullanici R verdi o zaman ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

      Scanner input = new Scanner(System.in);
        String harf = "";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
      do {
          System.out.println("Lutfen bir harf giriniz");
          harf= input.next().substring(0,1);

          if (c.contains(harf)) {
              c.set(c.indexOf(harf), "Bulundu");
          } else {
              c.add(harf);
          }
          System.out.println(c);
      }while (!harf.equals("Q"));








    }
}
