package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //           [2. 3, 12 , 0, 0 , 0]

        int original[] = { 0, 2, 3, 0, 12, 0 };

        int yeni []= new int[original.length];

        int idx = 0;

        for (int i =0;  i< original.length; i++){

            if(original[i] != 0){
                yeni[idx]=  original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));


        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
//                             ==> Kullanici 6'yi sordu ==> 6 elemani yok ve 0 kere tekrarlandi

        int arr []= {2, 1, 2, -3, 2};
        int eleman =5;
        int counter = 0; // flag: Bazi durumlarin olup olmadigini kontrol etmek icin " flag kullanilir.

        for(int w : arr){

            if(w==eleman){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(eleman+ "arrayde" + counter + " defa var");
        }else {
            System.out.println("Eleman array de yok");
        }

        //Example 3 : Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        // " Java kolaydir calisana , ne kolay ki calismayana."  ==> calismayana

        String sentence = " Java kolaydir calisana , ne kolay ki calismayana.";
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);
        // split methoduyla bir suru kelime yani date olustu elimizde coklu data var o yuzden array e atiyoruz.
        String words[] = sentence.split(" ");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));   //[, , Java, calisana, calismayana, ki, kolay, kSasolaydir, ne]
                                                      // sort methodu alfabetik siralama yapti

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));   //[, , ki, ne, Java, kolay, calisana, kolaydir,ss calismayana]
    }
}
