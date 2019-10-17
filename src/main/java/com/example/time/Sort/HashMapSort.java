package com.example.time.Sort;

import java.util.*;

/*
 *@author jiafeng
 *@date 2019/8/12 0012 16:36
 */
public class HashMapSort {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("b",3);
        map.put("c",7);
        map.put("d",5);
        map.put("e",4);
        map.put("f",9);
        HashMap<String,Integer> c= hashMapSort(map);
    }

    public static HashMap<String,Integer> hashMapSort(HashMap<String,Integer> map){
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
        for (Map.Entry<String,Integer> entry :list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}
