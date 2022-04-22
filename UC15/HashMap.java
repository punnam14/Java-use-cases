package Assignment15;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        String str = "To be or not to be";
        Map<String, Integer> hashMap = new java.util.HashMap<>();

        String[] words = str.split(" ");

        for(String word : words){
            Integer integer = hashMap.get(word);
            if(integer == null){
                hashMap.put(word,1);
            }else{
                hashMap.put(word,integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}