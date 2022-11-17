package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {


        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz.
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(germany, japan);
        System.out.println(fark);// 6

        //Example 2: sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate);  //2011-04-13

        /*
        Java da sabit datalari (gün isimleri, ay isimleri,Amerikadaki eyalet isimler) depolamak ve gerektiginde
        kullanmak icin depolar olustururuz. Bu depolara "Enum" denir.
         */

        //Example 3 : USA icin "Woow!" yazin, UK icin "Big" yazin, "CANADA" icin "Cold" yazin, "Turkey" icin "vatan" yazin
        // "GERMANY" icin "Araba", "RWANDA" icin "Cay" yazin

        Countries country = Countries.USA;

        switch (country) {

            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case Turkey:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke...");

        }

    }

}











