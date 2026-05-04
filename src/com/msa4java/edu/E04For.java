package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        // println은 딱 하나의 파라미터만 넣을 수 있다. 여러 개 못 넣음! (넣으려면 특정 형식을 지켜야 함!)
        // printf는 여러 개의 파라미터도 넣을 수 있고 문자열 안에 다른 거 넣는 것도 가능! f가 포맷(format)의 약자

        // 구구단 출력 ( 내 꺼 )
//        for (int i = 2; i < 10; i++) {
//            System.out.printf("** %d단 **", i);
//            System.out.println();
//            for ( int j = 1; j < 10; j++) {
//            System.out.printf("%d X %d = %d", i, j, i * j);
//            System.out.println();
//            }
//        }


        // ( 선생님 꺼 )
        int dan = 2;

        for(int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for(int z = 1; z <= 9; z++) {
                String strMulti = String.format("%d X %d = %d", i, z, i * z);
                System.out.println(strMulti);
            }
        }


    }
}
