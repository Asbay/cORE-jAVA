package day01variables;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayCevir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz");
        String satz = scan.nextLine();

        String [] arr = satz.split(" ");
        System.out.println(Arrays.toString(arr));

        String [] arr1 = satz.split("");
        System.out.println(Arrays.toString(arr1));

    }
}
