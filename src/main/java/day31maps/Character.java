package day31maps;


import java.util.HashMap;
import java.util.Map;

public class Character {


    // Driver code
    public static void main(String[] args)
    {

        // Initializing a Map of type HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Ninde");
        System.out.println(map);

        int hash = map.hashCode();

        System.out.println(hash);
    }
}

