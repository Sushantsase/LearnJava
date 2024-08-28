package com.map;

import java.util.HashMap;
import java.util.Map;

//for given string, remove all charcter who have even numberr frequencyt
public class HashMapExampleRemove {
    public static void main(String[] args) {
        String str = "aaapplsfdksdfsdddfklwlkerlwerrweaacxsc";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                Integer value = map.get(str.charAt(i));
                value = value + 1;
                map.replace(str.charAt(i),value);
                if(value % 2==0){
                    map.remove()
                }
            } else {
                map.put(str.charAt(i),1);
            }
        }

        for(Map.Entry ma : map.entrySet()){
          //  System.out.println(ma.getValue());
            System.out.println(ma.getKey() +"->"+ma.getValue());
        }
    }
}
