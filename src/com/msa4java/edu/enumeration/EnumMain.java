package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day);   // System.out.println(day.toString()); 과 동일 -> MONDAY 출력
        System.out.println(day.name());
        System.out.println(day.getKrDay());
    }
}
