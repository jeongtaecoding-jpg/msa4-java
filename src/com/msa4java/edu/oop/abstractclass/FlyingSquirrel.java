package com.msa4java.edu.oop.abstractclass;

public class FlyingSquirrel extends Mammal{
    public FlyingSquirrel(String name) {
        super(name, "산");
    }

    @Override
    public void residence() {
        String result = String.format("%s에 산다람쥐. %s", this.residence, this.name);
        // System.out.println(this.residence + " " + this.name + "에 삽니다.");    이걸 다른 위의 방법으로도 표현 가능
        System.out.println(result);
    }
}
