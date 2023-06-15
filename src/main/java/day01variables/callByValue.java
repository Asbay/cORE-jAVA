package day01variables;

public class callByValue {
    public static void funktion1(int a) {
        a = a + 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a); // Ausgabe 5
        funktion1(a); // Ausgabe 15
        System.out.println(a); // Ausgabe 5
    }

}
