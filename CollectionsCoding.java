import java.util.*;

public class CollectionsCoding {

    public static void main(String[] args) {

        //Problem 1 - Word Frequency Counter

        String input = "java spring java sql spring java";


        Map<String, Integer> map = new HashMap<>();

        String[] news = input.split(" ");

        Integer i = 1;

        for(String word : news){
            if(!map.containsKey(word)){
                map.put(word, i);
            } else{
//                map.put(word,i+1);
                Integer temp = map.get(word);
                map.put(word, temp+1);



            }
        }
        System.out.println(map);

        //Problem 3: Remove Duplicate Characters

        String input1 = "programming";

        char[] characters = input1.toCharArray();

        Set<Character> characterSet = new LinkedHashSet<>();

        for(char c : characters){
            characterSet.add(c);
        }

        String newStr = "";
        for(Character ch : characterSet){
            newStr = newStr + ch;
        }

        System.out.println(newStr);











    }
}
