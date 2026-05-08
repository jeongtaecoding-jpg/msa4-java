package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));  // 4 출력

        // 정렬
        Collections.sort(list);
        System.out.println(list.get(3));  // 5 출력 (정렬됨)
        System.out.println(list.size());

        // 향상된 for문
        for(int i : list) {
            System.out.println(i);  // 1,2,4,5 출력
        }

        // forEach 문
        list.forEach((i) -> {
            System.out.println(i);  // 1,2,4,5 출력
        });

        
    }
}
