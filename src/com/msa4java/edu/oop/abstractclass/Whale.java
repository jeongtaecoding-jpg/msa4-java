package com.msa4java.edu.oop.abstractclass;

public class Whale extends Mammal implements Swim {
    public Whale(String name) {
        super(name, "바다");
    }

    @Override
    public void residence() {
        String output = String.format("%s %s에 삽니다.", this.name, this.residence);
        // System.out.println(this.name + " " + this.residence + "에 삽니다.");    이걸 다른 위의 방법으로도 표현 가능
        System.out.println(output);
    }

    @Override
    public void breath() {
        System.out.println("고래쪽에서 오버라이드");
    }

    public void swimming() {
        System.out.println(this.name + " 육중하게 헤엄칩니다.");
    }
}
