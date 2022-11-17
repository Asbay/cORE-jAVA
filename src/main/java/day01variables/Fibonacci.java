package day01variables;

import java.util.Scanner;

public class Fibonacci {
    //2)Fibonacci dizisindeki her yeni terim, önceki iki terimin
//eklenmesiyle oluşturulur. 1 ve 2 ile başlayarak, ilk 10 terim şöyle
//olacaktır:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//Fibonacci dizisindeki değerleri dört milyonu geçmeyen terimleri
//dikkate alarak çift değerli terimlerin toplamını bulunuz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi görmek istersin?");
        int tane = input.nextInt();
        int a= 1;
        int b= 1;
        int c;
        int toplam =0;


        for (int i=1; i<=tane; i++){
            System.out.print(a + " , ");
            c=a+b;
            a=b;
            b=c;
            if(a%2==0){
                toplam+=a;
            }

        }
        System.out.println();
        System.out.println("toplam="+ toplam);
    }
}
