package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);     //[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

// removeAll kullandigimizda sadece ilk List degisir, parantezin icindeki list degismez
        names.removeAll(cities);
        System.out.println(names);      //[Thomas, Tahsin]
        System.out.println(cities);     //[Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsine");

        boolean sonuc1 = names.containsAll(myNames);
        //Bir Listin icinde coklu elemanlarin var olup olmadigini kontrol eder Hepsi varsa true en az biri yoksa false verir.
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1 ; "a" listinde " Shoes" elemaninin ilk görünümünü siliniz
        a.remove("Shoes");
        System.out.println(a);   //[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2 : Shoes elemanlarinin tüm görünümlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);   //[TV, Radio, Laptop, Book]

        //Example 3 : bir tane salary maas listi olusturun eger salary 10000 den az is %20, 10000 den cok ise % 10 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for(Double w: salary){
            if(w<10000){
               salary.set(salary.indexOf(w), w* 1.2);
            }else
                salary.set(salary.indexOf(w), w* 1.1);
        }
        System.out.println(salary);

        //Example 4 : 2 ArrayList in esit olup olmadigini kontrol eden kodu yaziniz
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('z');
        n.add('y');

        //1.yol;
        int counter =0;

        for(int i=0; i<m.size(); i++){
            if (m.size() != n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break; // break koymanin sebebi ilk esit olmayan elemanlari buldugunda loopu kirmak icindir.
                //eger break kullanmazsak kod dogru calisir ama geriye kalan butun elemanlari kontrol eder.
            }
        }
        if (counter== 0 ){
            System.out.println("Listler esittir.");
        }

        //"2.yol

        boolean esitmi = m.equals(n);

        if(esitmi) {
            System.out.println("Listler esittir");
        }else{
            System.out.println("Listler esit degil");
        }


    }
}
