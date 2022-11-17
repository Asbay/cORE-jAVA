package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {

        //Example bir Listteki elemanlardan birbirine en yakin olan ikisini bulunuz.
        //  [12, 15, 19, 30, 21] bu listte birbirine en yakin elemanlar 19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a); //List teki elemanlari kücükten büyüge dizebilmek icin kullanilir]
        //[12, 15, 19, 21, 30]
        System.out.println(a);


        int minFark = Integer.MAX_VALUE;
        for(int i =1; i<a.size() ; i++) {

            minFark = Math.min(minFark, a.get(i) - a.get(i-1));

        }
        System.out.println(minFark);
    }
}
