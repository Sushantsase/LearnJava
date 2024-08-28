package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> schoolMap = new HashMap<>();
        schoolMap.put("1","AB");
        schoolMap.put("12","AB2");
        schoolMap.put("13","AB3");
        schoolMap.put("14","AB4");
        schoolMap.put(null,"ABss4");
        schoolMap.put(null,"dsssdds");

        for (Map.Entry m: schoolMap.entrySet()){
            System.out.println(m.getKey() +" : name"+m.getValue());
        }


    }
}
