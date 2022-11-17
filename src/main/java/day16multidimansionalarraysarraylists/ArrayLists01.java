package day16multidimansionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        /* ArrayListler ayni data tipine sahip birden fazla data yi depolamak icin kullanilir
        Array ile ArrayList in farki:
       1)Array olustururken Arrayin icine kac tane eleman koymamiz gerektiigni soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz
         Arrayler eleman sayisinda "fixed" dirler.
         ArrayListleri olustururken eleman sayisi soylemeye gerek yok cunku ArrayListler eleman sayisinda "flexible" esnektirler
       2) Arraylerin icine "primitive" ve "reference" lar konulabilir
         Arraylistlerin icine ise sadece "non-primitive"ler konulur.
       3) Arrayler super fast yani cok hizlidir. Arrayler memory yi cok az kullanirlar.
         */

        //ArrayList nasil olusturulur
        //1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();


        //ArrayListler nasil yazdirilir
        System.out.println(nums);

        //ArrayListlere nasil eleman eklenir
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);  // add methodu boolean verir yani true yada false. add methoduyla yerlestirilemeyebilir.
        nums.add(18);
        nums.add(20);
        System.out.println(nums);   //[21, 18, 20]

        nums.add(1,58);  // burdaki add methodu hicbirsey sonuc vermez
        System.out.println(nums);  //[21, 58, 18, 20]

        List<Integer> prices = new ArrayList();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums); //[21, 58, 18, 20, 23, 185]
        System.out.println(prices);  //[23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);  //[21, 58, 23, 185, 18, 20, 23, 185]

        //ArrayListlerin eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);  //8

        //ArrayListlerde herhangi bir elenman nasil secilir?
        int el1 = nums.get(3);
        System.out.println(el1);  // get methodu istenen bir index deki elemani verir.

        //ArrayListin bos olup olmadigini nasil analriz
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);   //false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);

        //ArrayListte bir eleman nasil degistirilir?
        nums.set(3,200);
        System.out.println(nums); //[21, 58, 23, 200, 18, 20, 23, 185]

        //Example 1 : nums ArrayList`indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for(int w :nums ){
            if( w%2 != 0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);  //[32, 58, 34, 200, 18, 20, 34, 196]

        //bir elemani silmek istedigimizde remove u kullanabiliriz
        //remove() methodunun icine tamsayi koyarsak java onu index olarak kabul eder burda 5. index 20 yi silecek
        nums.remove(5);
        System.out.println(nums);   //[32, 58, 34, 200, 18, 20, 34, 196]
                                    //[32, 58, 34, 200, 18, 34, 196]

        // eger bir arraydeki belli bir sayiyi silmek istiyorsak asagidaki gibi kullanmaliyiz
        //Example: ArrayListten 200 elemaninin ilk görünümünü  siliniz
        //Note 1: Tum tamsayilar aksi söylenmedikce Java icin "primitive" dir. Yani "int" dir.
        //Note 2: "primitive ler ArrayListlerin elemani olamazlar
        //Note3 : "primitive" i Wrapper Classa ceviriseniz , non primitive olur ve non primitiveler Arraylistin elemani olur, index olmaz


        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);   //[32, 58, 200, 18, 34, 196]

    }
}
