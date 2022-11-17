package day24_statickeywordencapsulation;
/*
    1)Encapsulation "Data Hiding(gizlemek) demektir
    2)Data yi neden gizleriz? Dis etkenlerden korumak icin
    3)Data yi nasil gizlersiniz? Access modifier ini "private" yaparak gizlerim
    4)Datayi gizledinkten sonra baska classlardan okumak istersen ne yaparsin?
      i)"get" methodlar (GETTER) olusturarak gizledigimiz data lari okunur hale getirebiliriz.
      ii)ariable nin Data Type i ile get methodun Return Type i ayni olmalidir
    degisince tüm methodlarda variable in ismi get ile baslatilir ama boolean oldugunda is ile baslar.
    get methodlari isimlendirirken " get + <variable name> kullanilir. Ancak variablenin data type i boolean ise
    ozaman " is+ <variable name> kullanilir
    5)Data yi gizledikten sonra baska Class lardna degistirmek istrsen ne yaparsin?
    "set" methodlar (SETTER) olusturarak gizledigimiz datayi degistirebiliriz




     */
public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
