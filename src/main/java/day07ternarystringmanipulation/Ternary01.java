package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazan kodu yaziniz.

        int a= -12;

        //1.yol if else ile cözelim
        if(a>0){
            System.out.println("Pozitif");

        }else{
            System.out.println("Pozitif degil...");
        }

        //2.yol ternary
       String sonuc = a>0  ?  "Pozitif" : "Pozitif degil";
        System.out.println(sonuc);

        //iki sayidan kücük olani secen programi yaziniz
        int b=23;
        int c=23;
        int min = b<c ? b : c;
        System.out.println(min);

        // verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int d = -45;

        int mutlak = d<0 ? (-1)*d : d;
        System.out.println(mutlak);


        //iki sayi ayni isretli ise bu sayilari carpiniz. Farkli isaretli ise islem yapamam mesaji veriniz

        int k= -12;
        int l= 3;
        Object son= (k>0 && l>0) || (k<0 && l<0) ? k*l : "islem yapamam";
        System.out.println(son);
       //ternary farkli data tiplerinde sonuc return ederse sonucun data tpini Object yapiniz.
      //java d her classin bir parent klasi vardir sadece object klassin bir parent klassi yoktur








    }

}
