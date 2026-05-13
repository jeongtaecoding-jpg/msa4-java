package com.msa4java.edu.lambdaandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args) {
        MyAddInterface myAddInterface = (a, b) -> a + b;

        myAddInterface.plus(1, 2);


        // ----------------------------
        // 스트림
        // ----------------------------
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("둘리");
        list.add("도우너");
        list.add("또치");

        // 1. 리스트를 스트림으로 생성
        Stream<String> stream = list.stream();
        List<String> newList = stream.map(name -> {
            return "이름 : " + name;
        }).toList();


        for(String s : list) {
            newList.add("이름 : " + s);
        }

    }

    // 일반적인 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 위 메소드를 람다식으로 표현
//    (a, b) -> { return a + b; }
//    (a, b) -> a + b;



}
