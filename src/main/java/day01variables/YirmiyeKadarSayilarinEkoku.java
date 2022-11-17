package day01variables;

public class YirmiyeKadarSayilarinEkoku {
    /*
     1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
//        kaçtır ?
     */
    public static void main(String[] args) {
        long top = 1;
       /* int j = 21;

        while (true) {
            top = 0;
            j++;
            for (int i = 2; i < 12; i++) {
                top += j % i;
            }
            if (top == 0) {
                System.out.println(j);
                break;
            }

        }
*/  int sayi = 19;
        boolean uygun = true;
        do {
            sayi++;
            uygun = true;
            for (int i = 1; i < 21; i++) {
                if (sayi % i != 0) {
                    uygun = false;
                    break;
                }
            }
        }while (!uygun);

        System.out.println(sayi);


    }


    }