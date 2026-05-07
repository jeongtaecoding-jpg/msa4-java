package com.msa4java.edu.oop.inheritance;

public class Whale extends Mammal {
    public Whale(String name, String residence) {
        // super() : 부모의 생성자를 호출하는 메소드,
//        super();  파라미터가 없는 super메소드가 생략되어있다. (주석해제해도 똑같이 동작함, 디폴트로 실행)

        //  파라미터가 있는 슈퍼로 인해 이건 생략
//        this.name = name;
//        this.residence = residence;

        // 부모 클래스의 생성자의 파라미터가 있을 땐 파라미터를 포함한 super()를 따로 만들어야 함
        super(name, residence);
    }

    // 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 재정의하는 것
    @Override    // 오버라이딩 했다는 뜻인 어노테이션
    public void breath() {
        // super 키워드 : 부모 클래스로부터 상속받는 필드나 메소드를 자식 클래스가 참조하기 위해 사용하는 참조변수
        super.breath();
        System.out.println(this.name + "이/가 폐호흡을 하고 숨을 잘 참습니다.");
    }

    public void swimming() {
        System.out.println(this.name + "이/가 헤엄칩니다.");
    }
}
