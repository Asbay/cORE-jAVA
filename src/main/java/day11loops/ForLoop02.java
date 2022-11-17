package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Bir Stringdeki m karakteri haric tüm karakterleri yazdiriniz
        // Andromeda ==> Androeda

        String str = "madam";

        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);

            if (c != 'm') {
                System.out.print(c);
            }
        }
        //2.yol

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'm') {
                continue;   // Bosveeerrr
            }
            System.out.println(c);
        }

        //Example 2 : 1 den 100 e kadar, 6 ile bölünenler haric  tüm tam sayilari ekrana yazdirniz

        for (int x = 1; x < 101; x++) {
            if (x % 6 == 0) {
                continue;
            }
            System.out.print(x + " ");
        }
        System.out.println();
        //Example 3: size verilen bir stringdeki mden onceki karakterleri yazdiriniz.
        String s = "Luxemburg";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'm') {
                break;
            }
            System.out.print(c);

        }
    }
}