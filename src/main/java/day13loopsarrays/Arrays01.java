package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
       /* Byte boolean short,int gibi ... containerlar iclerinde sadece tek bir deger barindirabilir.Ancak bazen coklu deger
        tasimasini istedigimiz containerlara ihtiyac duyariz.Buna Array denir.
        Icine yerlestirdigimiz Datalarin Data Type'i hep ayni olmalidir
        1) Ayni data tipinde coklu datayi depolamak icin javanin olusturdugu yapilar vardir bu yapilardan birisi de
        Array lerdir.

        */
        //Array nasil olusturulur
        int stdAges[] = new int[7];   // [0 , 0, 0, 0, 0, 0, 0 ]
        //Array nasil yazdirilir
        System.out.println(Arrays.toString(stdAges));

        //Arraylere eleman nasil eklenir.
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] =13;
        stdAges[3] = 14;
        stdAges[4] =10;
        stdAges[5] = 12;
        stdAges[6] =12;
        System.out.println(Arrays.toString(stdAges));

        //Arraydeki herhangi bir elemani nasil yazdirabiliriz
        System.out.println(stdAges[4]);

        //Example 1: Arraydeki en kücük ve en büyük elemani ekrana yazdiriniz.

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk =stdAges[0];
        int son = stdAges[stdAges.length - 1 ];
        // length() String de kullanilir "length" Arraylerde kullaniir
        System.out.println(ilk);
        System.out.println(son);
        System.out.println(ilk + son );
        //Example 2 : stdAges Arrayi icindeki tüm elemanlarin toplamini ekrana yazdiran kodu yazdiriniz

        int sum = 0;

        for (int i = 0; i< stdAges.length; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.yol while
        int i = 0;
        int toplam = 0;

        while (i < stdAges.length) {
           toplam = toplam + stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.yol do while ile yap
        int k =0;
        int topl = 0;

        do{
            topl = topl + stdAges[k];
                k++;

        }while(k < stdAges.length);
        System.out.println(topl);

        //4.yol for each loop.... en gelismis loop dur. Mumkunse bu kullanilmalidir.
        // FOR EACH loop Arraylerde ve Collection slarda kullanilir

        int t = 0;

        for( int w : stdAges   ) {
            t= t + w ;

        }
        System.out.println(t);


        //Example 3: String bir Array olusturunuz
        // Ba Array e 5 tane isim yerlestiriniz
        // Bu islemlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String str[] = new String [5];
        str[0] = "Ayse";
        str[1] ="Nazli";
        str[2] = "Nazar";
        str[3] ="Gül";
        str[4] ="Günes";

        System.out.println(Arrays.toString(str));
        int karakterSayilariToplami = 0;
         for(String w : str){
             karakterSayilariToplami = karakterSayilariToplami + w.length();
         }
        System.out.println(karakterSayilariToplami);

         //Example 4=  char bir array olusturunuz.
        // bu array e 5 eleman ekleyiniz
        // bu arraydeki sadece buyuk harfleri ekrana yazdiriniz.

        char chr [] = {'A', 'c' , 'D', 'k', 'm'};

        for( char w: chr) {

            if(w >='A' && w<= 'Z'){
                System.out.print(w);
            }
        }


























    }
}
