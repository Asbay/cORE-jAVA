package day29abstractioncollections;

public class Civic implements Engine ,Ac{
/*
        "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
        "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler

        "interface"ler bir yapılacak işler listesidir.(TO DO LIST)

    * "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
       bu methodlarin return typle'lari ayni olmalidir aksi takdirde hata verir.
 */


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
