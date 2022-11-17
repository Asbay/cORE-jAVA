package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Arrayslerin icine sadece primitive data typleri yerlestirilir.
        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprised you";

        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom" ve "Tom"dan  dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;
            }

        }
        System.out.println();

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {

            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz
        //bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStudent = input.nextInt();

        String names[] = new String[numOfStudent];

        for(int i =1; i<= numOfStudent ; i++){
            System.out.println("Lutfen "+ i + ". ögrenci ismini giriniz");
            System.out.println("Girisi sonlandirmak icin Q harfine basiniz");
            //names[i-1] = input.next();
            String stdName= input.next();
            if(stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]= stdName;
        }
        System.out.println(Arrays.toString(names));

    }

}