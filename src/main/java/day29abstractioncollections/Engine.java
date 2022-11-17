package day29abstractioncollections;

public interface Engine extends Vehicle{

/*
    "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
    "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler

    "interface"ler bir yapılacak işler listesidir.(TO DO LIST)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu method'ların
    return type'ları aynı olmalıdır. Aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
    "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.
 */
    //interface'lerdeki tüm variable'lar otomatik olarak(default) "public"dir.
    //interface'lerdeki tüm variable'lar otomatik olarak(default) "final"dir.
//interface'lerdeki tüm variable'lar otomatik olarak(default) "static"dir.

    int price =2000;

    double weigth =23.5 ;
    void run();


}
