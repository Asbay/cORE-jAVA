package day10stringmanipilations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a ="Java kolaydir.";
        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
//"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

        boolean b = a.startsWith("kola",5 );

        System.out.println(b);

        String c = a.replaceFirst("a","*");
        System.out.println(c);
        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
//replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String d = a.replace("a","*");
        System.out.println(d);

        //concat() methodu iki tane Stringi birbirine yapistirmaya yarar.
        //Concatenation islemi iki turlu yapilabilir i) + ile ii) concat() ile
        // java bir islem icin method uretmisse o methodu kullanmak best practice dir.

        String e = a.concat(" Anladin mi?");
        System.out.println(e);

       String f =  a+ " Anladin mi?";
        System.out.println(f);

        String g = "     Tom Hanks    ";
        //trim methodu bir stringin bas ve sonundaki space karakterlerini siler.Aradaki space karakterlerine dokunmaz
        String h = g.trim();
        System.out.println(h);



        //comprateTo(i) kod iki tane    String'i alfabetik(lexicographic) olarak karşilaştirir.
        //Buyuk harf e duyarilidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i) kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

        String i ="Java";
        String j ="java";

        int l = i.compareTo(j);
        System.out.println(l);

        int k = i.compareToIgnoreCase(j);
        System.out.println(k);

//a.repeat(5); kodu "a" String'ini yanyana 5 kere yapıştırır.
        //Java Documents'a ulaşmak için --> Windows==>Ctrl e basılı tutun ve mouse ile method ismine tıklayın.

        String n =a.repeat(3);
        System.out.println(n);





    }
}
