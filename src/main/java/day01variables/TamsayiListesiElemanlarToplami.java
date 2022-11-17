package day01variables;

import java.util.ArrayList;
import java.util.List;

public class TamsayiListesiElemanlarToplami {

    public static void main(String[] args) {


        List<Integer> tam = new ArrayList<>();
        tam.add(12);
        tam.add(21);
        tam.add(45);
        tam.add(32);
        tam.add(76);
        tam.add(25);

        int toplam =0;

        for(int i =0; i< tam.size(); i++){
         toplam +=   tam.get(i);

        }

        System.out.println(toplam);
    }


}
