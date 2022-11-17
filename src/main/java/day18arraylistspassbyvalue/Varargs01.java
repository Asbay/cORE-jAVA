package day18arraylistspassbyvalue;

public class Varargs01 {

    public static void main(String[] args) {
/*
    1)Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak isterseniz "varargs" kullanmalısınız.
    2)"varargs" arka tarafta "Array" kullanır, bu yüzden "varargs" larla çalışırken "Array"lerle çalışıyormuş gibi davranabilirsiniz.
    3) "varargs" olusturmak icin <data type>...>varargs ismi
    4) bir methodda "varargs in yaninda  baska bir madde kullanilir ama varargs sonda olmak zorundadir
    5) Bir methodda birden fazla "varargs" kullanilabilir mi?
        "varargs" en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir. buda
         4. kural ile celisir.
 */
        int r1 = add(2,3);
        System.out.println(r1);

        int r2 = add(2,3,4);
        System.out.println(r2);

        int r3 = add(2,3,4,5,6,7,8,9);
        System.out.println(r3);


    }
    //iki sayinin toplamini return eden bir method olusturunuz
   /*  public static int toplama(int a , int b){

       return a+b;
    }
    //uc sayinin toplamini veren methodu yaziniz
    public static int toplama(int a , int b, int c) {

        return a + b + c;
    }
    //dört sayiin toplmani veren methodu yaziniz
    public static int toplama(int a , int b, int c, int d) {

        return a + b + c + d;
    }

    */
    // istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
    public static int add(int... a){ // burda int...a dan sonra string yazamadik cunku int...a dipsiz kuyu gibi sonu yok
        //o yuzden mutlaka int...a sona yazilmali    public static int add(String s, int... a)
        int sum =0;

        for( int w : a){
            sum = sum +w;
        }
        return sum;
    }






}
