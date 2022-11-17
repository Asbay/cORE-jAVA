package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

//binarySearch() Method: Bu method'u kullnarak bir elemanin Array'de olup olmadigini anlariz.
//                       binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
//                       binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

//                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
//                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
// binarySearch metdodu tekrarlayan elemanlar icin kullanilmaz



        int arr[] ={12, 14, 31, 43, 14 };
        int sayi =31;

        Arrays.sort(arr); // [12, 14, 31, 43] ilk önce sort Arrayi kücükten büyüge siraladi.

        int idx1 = Arrays.binarySearch(arr, sayi);

        System.out.println(idx1);  // cevap 3

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);  //sonuc -5 .. Eksi isaretinin anlami burda eleman Arrayde yok demek.
                                    // 5 ise eger olsaydi hangi sirada olurdu demek.

        int sayi3 = 17;
        int sonuc1 = Arrays.binarySearch(arr,sayi3);   // cevap -3 cikti eksi bu sayinin Arrayde olmadigini söylüyor
        System.out.println(sonuc1);                   // 3 de eger sayi Arrayde olsaydi hangi sirada olurdu onu soyluyo

    }
}
