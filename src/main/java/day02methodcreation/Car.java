package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;


    public static void main(String[] args) {
           // Object nasil olusturulur
        //1) Class ismini yaz 2) Objecte isim ver   3) =  4)new keywordunu kullan  5) Class ismi parantezle beraber
          Car myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();



        MethodCreation obj = new MethodCreation();
    }
    public void hareketEt(){

        System.out.println("Honda guzel hareket eder...");

    }

    public void dur(){

        System.out.println("Honda guvenli durur...");

    }


}
