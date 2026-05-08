package com.msa4java.edu.oop.abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
        Whale whale = new Whale("고래");
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("날다람쥐");

        whale.residence();
        flyingSquirrel.residence();

        whale.swimming();


        // 다형성
        // 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질
//        자식 클래스가 부모 클래스의 타입으로 업캐스팅됨[위로 한 단계 올라감] (Mammal엔 swimming이 없음)
//        Mammal whale2 = new Whale("고래2");
//        whale2.residence();
//        whale2.swimming(); 오류

        Whale whale2 = new Whale("고래2");
        Mammal castingWhaleToMammal = (Mammal)whale2;  // 업캐스팅 (위와는 다른 방식)
        whale2.swimming();
//      castingWhaleToMammal.swimming(); 오류(접근 불가)  // 업캐스팅이 되었을 땐 자식 클래스가 가진 멤버(프로퍼티와 메소드)에는 접근이 불가능
        whale2.breath();
        // 부모의 형태지만 오버라이딩된 메소드는 여전히 자식의 것을 쓴다. (자식만이 가진 메소드는 안된다)
        castingWhaleToMammal.breath();

        // 다운 캐스팅 : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅 하는 것 (업캐스팅이 된 것만 가능)
        Whale downCastingWhale = (Whale)castingWhaleToMammal;
        downCastingWhale.swimming();   // swimming으로 접근이 가능해짐.


        Mammal[] arrMammal = new Mammal[4];
        arrMammal[0] = new Whale("고래1");
        arrMammal[1] = new Whale("고래2");
        arrMammal[2] = new Whale("고래3");
        arrMammal[3] = new FlyingSquirrel("날다람쥐4");

        for(int i = 0; i < arrMammal.length; i++) {
            Mammal obj = arrMammal[i];

            if(obj instanceof Whale) {
                Whale whale3 = (Whale) obj;
                whale3.swimming();
            }
            else if(obj instanceof FlyingSquirrel) {
                FlyingSquirrel flyingSquirrel3 = (FlyingSquirrel) obj;
                flyingSquirrel3.residence();
            }
        }
    }
}