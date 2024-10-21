import java.util.HashMap;

public class HashMapUpdateAndRemove {

    public static void main(String[] args){


        // Creating the first map and adding values
        HashMap<Character, String> mapNo1 = new HashMap<>();
        mapNo1.put('a' , "aaa");
        mapNo1.put('b' , "bbb");
        mapNo1.put('c' , "CCC");

        // Creating second map
         HashMap<Character, String> mapNo2 = new HashMap<>();
         mapNo2.put('b' , "xyz");
         mapNo2.put('c' ,"ccc");

         // Creating third map
         HashMap<Character , String> mapNo3 = new HashMap<>();
        mapNo3.put('a' , "aaa");
        mapNo3.put('c' , "meh");
        mapNo3.put('d' , "hi");

        //print in the output screen
        System.out.println("Map 1 modification: " + modifyMap(mapNo1));
        System.out.println("Map 2 modification: " + modifyMap(mapNo2));
        System.out.println("Map 3 modification: " + modifyMap(mapNo3));

    }
    public static HashMap<Character, String> modifyMap(HashMap<Character, String> map) {

        // Checking if key 'a' is in the map
        if (map.containsKey('a')) {
            // Change the value of 'a' to key 'b'
            map.put('b', map.get('a'));
        }
        // Removing the key 'c' from the map
        map.remove('c');

        //return map
        return map;
    }
}


