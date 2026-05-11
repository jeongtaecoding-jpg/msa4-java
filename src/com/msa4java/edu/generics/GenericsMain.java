package com.msa4java.edu.generics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        // 제네릭스 사용 안 함
        Box1 box1 = new Box1();
        box1.add(2);
        box1.add(5);

        System.out.println(Arrays.toString(box1.arr));



        // 제네릭스 사용  Box2.java에서 <T>를 넣었기 때문에 원하는 자료형으로 지정할 수 있음
        Box2<String> box2 = new Box2<String>();
        box2.add("test");

        Box2<Integer> box2Int = new Box2<Integer>();
        box2Int.add(1);

        List<LocalDateTime> list = new ArrayList<LocalDateTime>(10);
        list.add(LocalDateTime.now());
        list.add(LocalDateTime.of(2026, 5, 8, 17, 20, 30));

    }
}
