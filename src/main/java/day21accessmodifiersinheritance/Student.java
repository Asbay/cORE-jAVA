package day21accessmodifiersinheritance;

public class Student {
 /*
    Access Modifier
    1)public     2)protected     3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)      4)private
    Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz
 */

    public String stdName = "TomHanks";
    //public her class'dan kullanılabilir.
    protected String address = " Miami";
    //protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir
     String email= "th@gmail.com"; // default : Accessmodifeir i default yapmak icin hicbisey yazmazsak o defaulttur
    //bu email kismi default basina o yüzden bisey yazmadik dolyasiyla default oldu
    private String stdId = "20206517004";
  // private olanlar sadece olusturulduklari class icinde kullanilabilirler. //public her class'dan kullanılabilir.
}
