package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sıralamaya tabi tutmaz.
            3)HashTable, HashMap'lerden daha yavaştır. Çünkü HashTable'lar thread-safe ve synchronized'dır.
            4)HashTable'larda key null olamaz. Key'i null yaparsanız NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsanız NullPointerException atar.

            INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.
     */
    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
        //countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);  //{Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}




    }

}

