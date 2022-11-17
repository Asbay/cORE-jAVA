package day01variables;

public class EnKücükPozitifTamsayi {

  /*  2520, 1'den 10'a kadar olan sayıların her birine kalansız
    bölünebilen en küçük sayıdır.
            1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
    kaçtır ?

   */
  public static void main(String[] args) {

      for (int a=1; a>0; a++){
          if (a%1==0 && a%2==0 && a%3==0 && a%4==0 && a%5==0 && a%6==0 &&a%7==0 && a%8==0 && a%9==0 && a%10==0  &&
                  a%11==0 && a%12==0 && a%13==0 && a%14==0 && a%15==0 && a%16==0 &&a%17==0 && a%18==0 && a%19==0 && a%20==0    ) {
              System.out.println(a);
            break;
          }else {
              continue;
          }
      }

  }
}
