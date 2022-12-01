package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("H");

        //Example 1 : iterators kullanarak list elemanlarini tersten konsola yazdiriniz
//hashNext() methodu pointer dan sonra eleman varsa true yoksa false dondürür
//next()methodu ise pointeri bir sonraki elemanin onune koyar ve ustunden tladigi elemani return eder
        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()) {
            itr.next();

        }
//hasPrevious() methodu senden once eleman var mı diye sorar true alinca kod calisir
        while( itr.hasPrevious()){
            // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
// previous ()methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
            String el = itr.previous();
            System.out.print(el+ " ");
        }



        //Example 2: List'deki tum elemanlari siliniz
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(myList);

        /*
            1) ListIterator da i)hasNext() ii)next() ii)set() iv)hasPrevious() v)previous() vi)remove() method'lari vardir.

            2) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.
        */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while(iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el);
        }
    }
    }
