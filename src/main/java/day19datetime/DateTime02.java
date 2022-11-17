package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Example 1 : java dan aldiginiz Date i "ay/gün/yil" olarak yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");  //10 dan kücük aylari 01 02 03 ... diye yazar
        String formattedDate1 = dtf1.format((currentDate));
        System.out.println(formattedDate1);  //10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format((currentDate));
        System.out.println(formattedDate2);  //Okt./21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format((currentDate));
        System.out.println(formattedDate3);  //Oktober/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");  // 10 dan kücük aylari 1, 2, 3 ... diye yazar
        String formattedDate4 = dtf4.format((currentDate));
        System.out.println(formattedDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5 = dtf5.format((currentDate));
        System.out.println(formattedDate5);    //10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");  // 10 dan kücük günleri 1, 2, 3, 4, ... seklinde yazar.
        String formattedDate6 = dtf6.format((currentDate));               //01, 02, 03 olarak yazmaz
        System.out.println(formattedDate6); //10/21/22


        //Example : javadan aldiginiz time in formatini degistiriniz

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);   //16:23:54.000002345
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm"); // büyük H 24 saat üzerinden yazar kücük h 12 saat üzerinden yazar.
        String formattedMyTime = dtf7.format(myTime);
        System.out.println(formattedMyTime); //16:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);   //04:23 nachm.
    }
}
