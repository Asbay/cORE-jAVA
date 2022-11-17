package day22inheritancepolymorphism;

public class Runner {


    public static void main(String[] args) {

        //Inheritance da variableler secilirken java object in data typeni bakar
        //oncelikli istediginiz variable i ve objectin data type i olan class da arar
        //o class da bulamazsa parent class lara bakar . Hicbir parent classda bulamazsa hata verir.


        Cat cat1 = new Cat();
        System.out.println(cat1.a);  //14 verdi cünku basinda Cat yaziyor o Cat klassindaki a yi secip onu veriyor
        System.out.println(cat1.b);   //34 b1 variable si Cat de yok ama onun parent i Mammal da var o yüzden parentdakini kullanir
        System.out.println(cat1.c);  //45 verdi Cat de c yok .Parent Mammal klassa gitcek ordada c yok sonra parent Animal a gitcek
                        //orda var o yuzden c yi Animaldan aldi
        // System.out.println(cat1.d); burda d hata veriyo cünkü hicbi classda d yok


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);   //13 verdi cünkü Mammal klassina gidp ordaki a yi bize verir




        Animal cat3 = new Cat();
        System.out.println(cat3.a);   //12 verdi cünkü Animal klassindaki a yi alip bize veriyo


        //Inheritance'da method'lar secilirken Java Constructor'a bakar
        //Oncelikle istediginiz method'u Constructori kullanilan Class'dan alir
        // o class da bulamazsa parent classa bakar
        // Hicbir yerde bulamazsa o methodu o zaman hata verir
        Cat cat4 = new Cat();
        cat4.eat();   // Cat eat cikti yani sagdaki konstraktir a bakiyo ve orda ne varsa oradaki eati yazdiriyo
        //Cat cat5 = new Mammal(); Bu hata verdi cünkü Mammal Cat in cocugu degil olmaz sagdaki soldakinin cocugu olmali
        cat4.drink();


        Mammal cat5 = new Mammal();
        cat5.eat();  //mammal eat


        Animal cat6= new Animal();
        cat6.eat();   //Animal eat


    }
}
