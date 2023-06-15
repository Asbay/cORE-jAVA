package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        //bir Arrayin elemanlari Array ise bu Arrayler "MultiDimensional Arraydir"

        int arr [][] =new int [3][2];
        System.out.println(Arrays.deepToString(arr));
// ciktisi ekranda bu oldu   [[0, 0], [0, 0], [0, 0]]
        // MultiDimensional Arraylere eleman ekleme nasil yapilir.

        arr[1][0]= 6;
        arr[0][0] = 3;
        arr[0][1]= -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

// MultiDimensional Array console a nasil yazdirilir
        System.out.println(Arrays.deepToString(arr));
        // ekranda ciktisi bu oldu [[3, -4], [6, 18], [-7, 0]]

        //Multidimensional arraylerde  Array elemanlarindan biri nasil yazdirilir
        System.out.println(Arrays.toString(arr[1]));
        // ekranda ciktisi bu oldu [6, 18]
        System.out.println(arr[1][0]);
        // bu ekrana 6 yi verdi


//Example 1: String bir Multidimesional Array olusturunuz.
//           Elemanlari ekleyiniz
//           Toplam eleman sayisini ekrana yazdiran kodu yaziniz
      String brr [][]= new String [4][3];

        brr[0][0] ="A";
        brr[0][1]= "B";
        brr[0][2] ="C";

        brr[1][0]= "D";
        brr[1][1] ="E";
        brr[1][2]= "F";

        brr[2][0]= "G";
        brr[2][1]= "H";
        brr[2][2]= "I";

        brr[3][0]= "J";
        brr[3][1]= "K";
        brr[3][2]= "L";

        System.out.println(Arrays.deepToString(brr));  //[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]

        int sum = 0;

        for(String[] w : brr){

            sum = sum +w.length;
        }
        System.out.println(sum);












    }
}
