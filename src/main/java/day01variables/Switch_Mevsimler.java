package day01variables;

import java.util.Scanner;

public class Switch_Mevsimler {


    public static void main(String[] args) {
        /*Yazdırmak için switch ifadesini kullanınız.
//a) Aralık, Ocak, Şubat için "Kış"
//b) Mart, Nisan, Mayıs için "Bahar"
//c) Haziran, Temmuz, Ağustos için "Yaz"
//d) Eylül, Ekim, Kasım için "Güz"
//e) Diğerleri için "Geçersiz ay adı"
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = input.next().toLowerCase();

        switch (ay){

            case "aralik": case "ocak" : case "subat" :
                System.out.println("Kis");
                break;
            case "mart": case"nisan" : case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran": case"temmuz" : case "agustos" :
                System.out.println("Yaz");
                break;
            case "eylül": case"ekim" : case "kasim" :
                System.out.println("Güz");
                break;
            default:
                System.out.println("Gecersiz ay adi girdiniz..");
        }
    }
}
