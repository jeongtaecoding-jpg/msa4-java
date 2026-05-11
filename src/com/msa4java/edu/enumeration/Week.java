package com.msa4java.edu.enumeration;

public enum Week {
// enum명은 클래스와 같이 첫 문자를 대문자로 작성하고 나머지는 소문자로 구성
// 관습적으로 열거 상수는 모두 대문자로 작성
// 열거 상수명이 복수의 단어로 구성된 경우 단어 사이에 `_` 로 연결
// 작성한 순서대로 ordinal이 부여 된다.(0부터 시작)
// enum 상수 하나당 자신의 인스턴스를 하나씩 만들어 `public static final` 필드로 공개


    // private Week MONDAY = new Week("월요일");
    // private Week TUESDAY = new Week("화요일");
    // private Week WEDNESDAY = new Week("수요일");
    // private Week THURSDAY = new Week("목요일");
    // private Week FRIDAY = new Week("금요일");
    // private Week SATURDAY = new Week("토요일");
    // private Week SUNDAY = new Week("일요일");


    // 위의 7줄을 이렇게 4단계로 나누어 작성할 수 있음
    // 열거형 상수 정의
    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    // 상수 문자열 저장 프로퍼티
    private final String krDay;

    // 싱글톤 생성자
    private Week(String day) {
        this.krDay = day;
    }

    // Getter
    public String getKrDay() {
        return this.krDay;
    }
}

