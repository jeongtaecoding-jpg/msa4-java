package com.msa4java.edu.oop.basic;

public class Marine {
    private int hp;
    private int damage;
    private int armor;

    // this() : 생성자[public Marine(int hp, int damage, int armor)] 호출
    public Marine() {
        this(40,6,0);
    }

    public Marine(int hp) {
        this(hp, 6, 0);
    }

    // 생성자 오버로딩됨, marine2가 가장 위의 생성자를 호출한 뒤, 파라미터 3개짜리인 이것을 호출
    public Marine(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }


    // getter 메소드 (값을 외부에서 받아갈 때 사용)
    public int getHp() {
        return this.hp;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getArmor() {
        return this.armor;
    }


    // setter 메소드 (private를 사용할 시 여기로만 값 수정이 가능)
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

}
