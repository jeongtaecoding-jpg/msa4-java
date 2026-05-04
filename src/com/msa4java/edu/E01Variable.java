package com.msa4java.edu;

public class E01Variable {
    public static void main(String[] args) {
        //  변수 선언
        int age;
        age = 1;
        String name = "홍길동";
        char ch = 'a';


        // 상수 (final 키워드 / 상습적으로 이름은 전부 다 대문자로, 언더바로 잇는다.)
        //  최초 할당하면 그 이후로는 재할당 안 됨.
        final String USER_NAME = "길동이";
//        USER_NAME = "둘리"    (불가능)


        // Underscore 표기법 (언더바를 넣어도 숫자로 인식 가능)
        int num2 = 200_000_000;


        // 두 변수의 값을 스와핑해보자.
        int swap1 = 1;
        int swap2 = 2;

        int temp;
        temp = swap2;
        swap2 = swap1;
        swap1 = temp;


        // 데이터 타입
        boolean boo = false;

        // 정수 타입 (int가 정수형 기본)
        byte bt = -128;
        short st = 32767;
        int integer = 2147483647;
        long longer = 2147483648L;

        // 실수 타입 (double이 실수형 기본)
        double db = 3.141592;
        // float엔 마지막에 f(F)를 붙여라
        float ft = 3.141592f;

       // 문자형 타입
        char char1 = '1';

        // 스트링의 비교
        String str1 = "홍길동";
        String str2 = "홍길동";
        System.out.println(str1.equals(str2));



//   패키지나 파일의 이름을 바꿀 땐 RENAME이 아닌 리팩터에 들어가서 이름 변경을 쓰기!!
    }
}
