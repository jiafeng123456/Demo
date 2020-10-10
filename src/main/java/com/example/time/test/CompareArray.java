package com.example.time.test;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/24 0024 16:37
 */
public class CompareArray {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
//        Integer[] A = {2,3,4};
//        List<Integer> a = Arrays.asList(A);
//        Integer[] B = {1,3,4,5};
//        List<Integer> b = Arrays.asList(B);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 300000; i++) {
            a.add(i);
        }
        for (int i = 250000; i < 800000; i++) {
            b.add(i);
        }
        List<Integer> delRoomIds = new ArrayList<>();
        List<Integer> addRoomIds = new ArrayList<>();
        for (Integer aa : a){
            if (!b.contains(aa)) {
                delRoomIds.add(aa);
            }
        }
        for (Integer bb : b){
            if (!a.contains(bb)) {
                addRoomIds.add(bb);
            }
        }
        System.out.println("方法 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        System.out.println(delRoomIds.size());
        System.out.println(addRoomIds.size());
    }


//   public static void main(String[] args) {
//       Long start = System.currentTimeMillis();
//       Map<Integer, Integer> a = new HashMap<>();
//       Map<Integer, Integer> b = new HashMap<>();
//       for (int i = 0; i < 3000000; i++) {
//           a.put(i,0);
//       }
//       for (int i = 2500000; i < 8000000; i++) {
//           b.put(i,0);
//       }
//       List<Integer> delRoomIds = getDiffentList(a,b);
//       List<Integer> addRoomIds = getDiffentList(b,a);
//       System.out.println("方法 耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
//       System.out.println(delRoomIds.size());
//       System.out.println(addRoomIds.size());
//   }

   //获取map1比map2减少的数据List
   public static List<Integer> getDiffentList(Map<Integer,Integer> map1,Map<Integer,Integer> map2){
       List<Integer> diffList = new ArrayList<>();
       for (Integer map : map1.keySet()){
           if (!map2.containsKey(map)) {
               diffList.add(map);
           }
       }
       return diffList;
   }
}
