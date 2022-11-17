package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        /*Example 1: Sayi pozitif ise ekrana pozitif yazdirin
        int s = -12;

        if(s>0 ){
            System.out.println("Positive"); }
*/
        //Example 2 : verilen karakter büyük harf ise ekrana büyük harf yazdirin

          /*  char ch ='A';

            if(ch>= 'A' && ch<= 'Z'){
                System.out.println("Buyuk Harf");
            }*/

        //Example3: verlin bir sayi 3 basamakli ise ekrana 3 basamakli yazdiriniz.

        /* int n = -123;

        n = Math.abs(n);

            if(n>99 && n<1000 ){
                System.out.println("Uc Basamakli");

            }   */


       /* //Example 4: verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz
        int n = -11;

        n= Math.abs(n);

        if (n % 2 == 0) {

            System.out.println("cift sayi");
        }
        */
        //Example 5 : verilen bir sayi 300 den kücük veya 1200 den büyük ise ekrana Harika sayi yazdir

        int r = 250;

        if(r<300 || r>1200){

            System.out.println("Harika Sayi");

        }
    }
}
