package day31maps;

import java.util.*;

public class HashMap01 {
    //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
    //Maplar key value srtuctor ini kullanirlar.
//Map lerde key kismi tekrarsiz data icerir(unique)
// value kismi unique olmak zorunda degildir.
//yalue da Null bir cok kere kullanilabilir.key lerde null tekrarsiz olarak kullanilir

//coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
//  bu iki deger depolamaya entry demisler
//mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz
//Hashmap ler entry set leri siralamakla ugrasmazlar,nicin cunku ,siralama zaman ister.bu yuzden hashmap ler superfasttir.

     /*
    mapler; key-value structure'ini kullanirlar. mapler'de key kismi tekrarsiz (unique) data barindirir.
    value kismi ise; unique olmak zorunda degildir (non-unique). key kisminda "null" kullanilamaz. ancak value'larda
    "null" mumkundur.
     */
     public static void main(String[] args) {

         HashMap<String, Integer> studentAges = new HashMap<>();

         studentAges.put("Ali",13);
         studentAges.put("Tom",21);
         studentAges.put("Brad",18);
         studentAges.put("Ajda", 76);
         studentAges.put("Cüneyt", 75);
         studentAges.put("Ali",88); // Ayni key degerini tekrar kullandigimizda hata vermez Overwrite yapar
         studentAges.put(null,65);
         studentAges.put(null,66);
         studentAges.put("AyhanIsik", null);
         studentAges.put("Sadri Alisik", null);
         System.out.println(studentAges);   //{null=66, Sadri Alisik=null, Tom=21, AyhanIsik=null, Ajda=83, Brad=18, Cüneyt=75, Ali=88}

         Set<String> keys =  studentAges.keySet();
         System.out.println(keys);   //[null, Sadri Alisik, Tom, AyhanIsik, Ajda, Brad, Cüneyt, Ali]


         //Map'den sadece value'lar nasil alinir
         Collection<Integer> values = studentAges.values();
         System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

         // Belli bir key "e ait value nasil alinir?

         Integer cuneytAge = studentAges.get("Cüneyt");
         System.out.println(cuneytAge);  //76

         //Example : Tüm integer yaslarin ortalamasii hesaplayan kodu yaziniz

         Collection<Integer> ages = studentAges.values();
         Integer sum = 0;
         double counter = 0;

         for(Integer w: ages){

             if(w!= null){

                 sum = sum+ w ;
                 counter++;
             }

         }
         System.out.println("Ortalama yas = "+ (sum/counter));

         //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
         //[null, Sadri Alisik, Tom, AyhanIsik, Ajda, Brad, Cüneyt, Ali]

         Set<String> names = studentAges.keySet();
         int sum1=0;
         for (String w: names){
             if( w!= null && !w.startsWith("A") ){
                 sum1 = sum1 +w.length();
             }
         }

         System.out.println(sum1);
         System.out.println(studentAges);

         //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
         boolean result = studentAges.remove("Ajda", 76);
         System.out.println(result);
         System.out.println("remove ajda" + studentAges);
         Integer result1 = studentAges.remove(null);
         System.out.println( "result= "+ result1);
         System.out.println(studentAges);

         //Key varsa value'u ver, key yoksa sizin istediginiz degeri verir
         Integer result2 = studentAges.getOrDefault("Tom", 12);
         System.out.println(result2);

         //Value null ise ekleme yapar, value null degilse ekleme yapmaz.
         Integer result3 = studentAges.putIfAbsent("Brad", 100);
         System.out.println(result3);
         System.out.println(studentAges);

         Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
         System.out.println(result4);
         System.out.println(studentAges);

         //Key yoksa ekleme yapar
         Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
         System.out.println(result5);
         System.out.println(studentAges);

         //replace() method'u value'lari key'e bakarak degistirdi
         studentAges.replace("Acun Ilicali", 49);
         System.out.println(studentAges);

         //replace() method'u value'lari key ve value'yu kontrol ettikten sonra degistirdi
         studentAges.replace("Acun Ilicali", 47, 53);
         System.out.println(studentAges);


         //Example 3:Map deki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
         //          {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

         //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
         Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();
         for(Map.Entry<String,Integer> w : entries){
             System.out.println(w);
         }
     }



     }

