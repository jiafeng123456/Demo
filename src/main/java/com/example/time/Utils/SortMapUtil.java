package com.example.time.Utils;

import java.util.*;

/*
 *@description:Map排序工具类<br>
 *@author jiafeng
 *@date 2019/12/6 0006 10:02
 */
public class SortMapUtil {
    /**
     * map排序，通过value排序
     * @param sortMap
     * @param comparator
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K,V> Map<K,V> sortByValue(Map<K,V> sortMap, Comparator<Map.Entry<K,V>> comparator){
        Map<K,V> sortedMap = new LinkedHashMap<K,V>();
        if (sortMap != null && !sortMap.isEmpty()) {
            List<Map.Entry<K,V>> entryList = new ArrayList<Map.Entry<K,V>>(sortMap.entrySet());
            Collections.sort(entryList,comparator);
            Iterator<Map.Entry<K,V>> iter = entryList.iterator();
            Map.Entry<K,V> tmpEntry = null;
            while (iter.hasNext()) {
                tmpEntry = iter.next();
                sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
            }
        }
        return sortedMap;
    }
}
