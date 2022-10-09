//This program is created By Aryaan Rabara 21CE112
//Github link:-https://github.com/21CE112/21CE112_JAVA_PRAC_7.git
//Aim:: Write a program that counts the occurrences of words in a text and displays the words and 
//their occurrences in alphabetical order of the words. Using Map and Set Classes
// Map is used for Dictionary kind of object hold
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class prac7_2 {

    public static void main(String[] args) {
        String text = "Most Powerfull Animal is Tiger" + " But The King Of The Jungle Is Lion..";
        System.out.println(text);
        Map<String, Integer> map = new TreeMap<>();
        //String as the key and Integer as a value
        String[] words = text.split("[  \n\t\r.,;:!?()]");
        // will split the string according to passed value. 
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                //Here we use some readymate Functions
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(  entry.getKey()+ "--> "+entry.getValue() );
        }
        System.out.println(map);
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
}



