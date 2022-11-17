package day10stringmanipilations;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1 : Ekrane 5 kere "Hi" yazdiriniz.
        //Tekrarli isler icin Loop kullaniriz
        //Dort cesit Loop var i)for loop ii) while loop iii) dowhile loop iv) for-each loop

        //i)for loop  Ekrana 5 kere Hi yazdiriniz

        // baslangic degeri  loop hangi sart altinda calisacak   Incremenz (arttirma) veya Decrement(azaltma)
        for(    int i = 1            ;         i<6                           ;    i = i+1                  ){
            System.out.println("Hi");
        }
        //example 2: 4 den 7 ye kadar tüm tam sayilari ekrana yazdiran kodu yaziniz

        for (int x = 4; x <20; x++){
            System.out.print(x+ " ");       //x+ " " 4 5 6 7  bosluk birakarak yanyana yazdirir
        }

        System.out.println();


        //Example 3 : 14 den 5 e kadar olan sayilari yazdirin
        for (int y = 14; y>4; y--){
            System.out.print(y+ " ");
        }

        System.out.println();
        //Example 14 den 5 e kadar olan cift sayilari yaziniz-

        for (int z = 14; z>5; z=z-2){
            System.out.print(z+ " ");
        }
        System.out.println();
        //2,yol
        for (int z = 14; z>5; z--){
            if(z%2 == 0){
                System.out.print(z+" ");
            }
        }
        System.out.println();
        //example 6 : 28 den 157 ye kadar tum tek sayilari yazdir

        for (int m = 28; m<158; m++){
            if(m%2 == 1){
                System.out.print(m+" ");
            }
        }
        System.out.println();

     //Example 7 : java stringini j*a*v*a* olarak azdiran program
        String str ="Java";
        for(int w=0; w<str.length();w++ ){
            System.out.print(str.charAt(w)+ "*");
        }
        System.out.println();

        //example 8 : size verilen stringde tekrarsiz karakterleri ekrana yazdiriniz
        // "Hellooo Ali" ==> He Ai tekrarsiz

        String s = "Hellooo Ali";

        for(int i = 0;i<s.length(); i++){
            char c =s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
            }

         }

    }
}
