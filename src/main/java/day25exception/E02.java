package day25exception;

public class E02 {

    public static void main(String[] args) {

        String arr[]= {"Ali", "Can", "Veli","Han"};
        getElementFromArray(arr,2); //Veli
        getElementFromArray(arr,4);  //ArrayIndexOutOfBoundsExceptio
        //Bir  String Arraydan index  girerek eleman elde edebilmek icin bir method olusturun.

    }

    public static void getElementFromArray(String arr[], int idx){
     try {
         System.out.println(arr[idx]);
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Array index te bir problem meydana geldi");

         e.printStackTrace();  //Exception ile ilgili detayli bilgi veriyoruz

         //Hata mesajini konsolda belirgin göstermke icin renkli yazdirmak icin.
         System.err.println("Array index de bir problem yasandi");
}
    }
}
