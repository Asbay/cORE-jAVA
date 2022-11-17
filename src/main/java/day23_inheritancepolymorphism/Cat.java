package day23_inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override   // override annotation inikullanarak javanin yaptigimiz override islemini kontrol etmesini saglariz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override

    public int add(int a, int b) {
       return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {   //short veya long koysakta kabul etmiyo Wrapper class oldugunda return type a dokunmayacagiz
        return a*b +1;
    }
//asagidaki method overre
    @Override
    public Animal create() {

        return new Mammal();
    }


    /*
    1) Override yaparken methodun sadece body si degistirilir.
    2) Override yaparken ASLA method signature (isim ve parametre) degistirilemez
    3)Override yaparken "inheritance" olmak zorundadir.
    4)Override yaparken "access modifier" lar belli kurallara göre farklılaştırılabilirler.
        i)"private" method'lar override edilemezler
        ii)Child Class'daki "override edilen" method'un access modifier'ı Parent Class'daki
           method'un access modifier'ı ile aynı veya daha geniş olmalıdır.
           Note: Child Class'daki method'un access modifier'ı daha dar olamaz.
        iii)"default method" lar aynı package içindeyse override edilebilirler.
            farklı package'dan override edilemezler.
    5)Parent Class'daki method'un "return type" ı "void" ise "return type" değiştirilemez.
    6)Parent Class'daki method'un "return type" ı "primitive" ise "return type" değiştirilemez.
    7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
 8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
           Note: Child Class'daki return type Parent Class'dakinden genis olamaz.
           Note: Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
                 kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat ararlarinda "Parent Child" iliskisi
                 olmadigindan "Integer" yerine "Short" kullanamazsiniz.
           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
         9)  Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
10) final methodlar override edilemezler . cünkü "overriding " de method body degistirilir.AmA final methodlard body degistirilemez
    11) Polymorphism Overloading + Overriding dir.
    Polymorphism nedir derlerse overloading ve overriding i anlatmak gerekir
    12) Overloading ile Overriding arasindaki farklar nelerdir)
      i) Overloading icin Inheritance gerekmez fakat Overriding icin gerekir.
      ii) "private" methodlar Overload edilirler ama Override edilemezler(cunku override baska klassdan oluyo baska klass dan
      private görülemeyecegi icin Override edilemezler
      iii)"final" methodlar Overload edilebilirler. Override edilemezler.
      iv) Overloading static polymorphism olarak , Overriding dinamic Polymorphism olarak adlandirilirlar.
         Cunku "static" method'lar Overload edilebilir, Override edilemezler.
                v) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.

    */

}
