package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {
        //Example "Anlik Tarihi (Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);  //2022-10-21

        //Example 2: "Anlik zamani (Current Time" ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);   //19:42:18.943073800


        //Anlik tarihi ve Anlik zamani ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);     // 2022-10-21T19:45:13.687863400

        //Example 4: Japonyadaki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        //Example 4: Istanbuldaki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        // Example 5: Bugunden 789 gün sonra emekli olacaginiza göre emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate currentDate2 = LocalDate.now();
        LocalDate retireDate = currentDate2.plusDays(789);
        System.out.println(retireDate);

        LocalDate countDate = LocalDate.of(2022, 10,21);
        LocalDate retireDate1 = countDate.plusDays(789);
        System.out.println(retireDate1);   //2024-12-18

        //Example :Iki cocugunuzun dogum tarihleri arasindaki farki gün olarak hesaplayan kodu yaziniz
// between (dobAli, dobVeli) methodu kullanildiginda daha eski olan tarih one yazilmalidir
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

       /* //Example : Tom, Aliden 3 yil 8 ay 13 gün sonra dogdu: Ali ise veliden 1 yil 15 gün once dogdu.
        //Tom un dogum tarihi 18 Kasim 2011 ise veli ve Alinin dogum tarihlerini bulunuz

       LocalDate dobTom = LocalDate.of(2011,11,18);
LocalDate dobofAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);   // method zinciri denir yani "Method Chain"
LocalDate dobofVeli = dobofAli.plusYears(1).plusDays(15);
System.out.println(dobofAli);   //2008-03-05
System.out.println(dobofVeli);   //2009-03-20


*/

        //Example 8: Istanbul un fethi ile, cumhuriyetin kurulmasi arasinda kac ay oldugunu gösteren programi yaziniz.
        //29.mayis.1453       29 ekim 1923
        LocalDate istanbulFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurtulus = LocalDate.of(1923, 10, 29);
        Long diff1 = ChronoUnit.MONTHS.between(istanbulFethi, cumhuriyetKurtulus);
        System.out.println(diff1);  //5645

        //Example verilen tarihin hangi burcta oldugunu gösteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989,12,7);
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();
//1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }



    }
}
