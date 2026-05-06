package com.msa4java.edu.oop;

// 정적(static)으로 만들어진 건 스택도 힙도 아닌 독자적인 곳에 저장  예시 : whale.age
// 메모리 두 영역, 스택과 힙의 차이
// 힙 : 개발자들이 직접적으로 관리하는 영역 (객체자체의 원본[Whale]은 여기에 저장)  예시 : whale.name
// 스택 : 시스템이 자동적으로 관리하는 영역 (변수가 저장되어 있고, 객체의 주소값이 저장되어 있음)


public class MainOOP {
    public static void main(String[] args) {

        // Whale 클래스를 인스턴스 생성
        Whale whale = new Whale();
        System.out.println(whale.name);
        whale.swimming();


        // static 맴버들에게 접근 (static으로 인스턴스를 생성하지 않고 사용)
        System.out.println(Whale.age);
        Whale.breath("테스트");


        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();


        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print();
        overloading.print('a');
        overloading.print(1,2);
    }

}
