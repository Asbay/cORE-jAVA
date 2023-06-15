package day01variables;

public class callByReference {


    public static void funktion2(int[] a) {
        a[0] = a[0] + 10;
        System.out.println(a[0]);
    }

    public static void main(String[] args) {
        int[] a = new int[] {5} ;
        System.out.println(a[0]); // Ausgabe 5
        funktion2(a); // Ausgabe 15
        System.out.println(a[0]); // Ausgabe 15
    }
}
