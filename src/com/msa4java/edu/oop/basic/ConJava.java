package com.msa4java.edu.oop.basic;

public class ConJava {
    public int age;
    // 생성자 (Construct)
    // 클래스를 인스턴스화 할 때, 딱 한번만 실행되는 메소드 (public, 리턴타입 없음, 클래스명과 동일)
    // 주로 객체의 초기화 또는 인스턴스 생성시 실행 되어야 하는 작업을 위해 사용하는 특수한 메소드
    // (고객들의 나이를 각각 저장한다 쳐서 그냥 만들면 1부터 100까지 파일을 100개 만들어야 하는데 생성자 하나면 다 커버 가능)
    // 개발자가 생성자 메소드를 생성하지 않을 경우 **기본 생성자(Default Constructor)**가 실행
    public ConJava(int age) {
        this.age = age;
        this.test();
    }

    private void test() {
        System.out.println("테스트 실행됨");
    }

}
