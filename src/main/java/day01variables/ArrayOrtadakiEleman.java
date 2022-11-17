package day01variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOrtadakiEleman {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(12);
        arr.add(10);
        arr.add(11);
        arr.add(21);
        arr.add(2);

        Collections.sort(arr);
        System.out.println(arr);
        double a = arr.get((arr.size()/2));
        double b = arr.get((arr.size()/2))-1;

        if(arr.size()% 2!=0 ){
            System.out.println("ortadaki Eleman= "+a );
        }else{
            System.out.println("ortadaki Eleman= "+((a+b)/2));
        }
    }
}
