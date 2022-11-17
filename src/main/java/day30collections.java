import java.util.LinkedList;

public class day30collections {

    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();


        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);  //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

   /*
            Retrieves, but does not remove, first element of this list.
            Returns: the first element of this list, or "null" if this list is empty
         */

        String firstEl = names.peek();
        System.out.println(firstEl); //Chris

        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);  //null

/*
        Retrives and removes  first elemnt of this list.
        Returns : the head of this list, or "null" if this list is empty
         */


        String firstElement = names.poll();
        System.out.println(firstElement);   //Chris
        System.out.println(names);    //[Alexandre, Mark, Tom, Jeremy, Hans]
 /*
        Retrieves, but does not remove, first element of this list.
        Throws: NoSuchElementException - if this listis empty
         */

        names.element();



        //Example 1 :"A" ile baslayan tum isimleri "*****" e ceviriniz

        LinkedList<String> students = new LinkedList<>();


        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);

        for( String w :students){

            if(w.startsWith("A")){
                students.set(students.indexOf(w),"*****" );
            }
        }
        System.out.println(students);



        //Example 2: List'deki 4 harften cok harf iceren isimleri siliniz.

        for(int i =0; i< students.size(); i++){

            if(students.get(i).length()>4){

                students.remove(students.get(i));

                i--;
            }
        }
        System.out.println(students);

    }
}