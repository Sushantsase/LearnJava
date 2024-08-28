package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        String str = "abhytaaabbtt";

        Map<Character, Integer> mapKey = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (mapKey.containsKey(str.charAt(i))) {
                Integer val = mapKey.get(str.charAt(i));
                val = val + 1;
                mapKey.replace(str.charAt(i), val);

            } else {
                mapKey.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry m : mapKey.entrySet()) {
            System.out.println(m.getKey() + " ->" + m.getValue());
        }

    }
}

