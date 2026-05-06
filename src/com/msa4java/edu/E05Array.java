package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // 길이 5의 int 배열 생성 및 초기화
        int[] arrInt = new int[5];
        arrInt[2] = 50;
        System.out.println(Arrays.toString(arrInt));
        // 아래처럼 그냥 객체를 넣을경우 .toString이 자동실행됨 (주소값을 반환함)
        System.out.println(arrInt);
        System.out.println(arrInt.toString());

        // 길이 4의 char 배열 생성 및 초기화(요소의 값도 셋팅)
        char[] arrChar = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arrChar)); // 정상적으로 배열을 출력하려면 Array를 써야 함
        System.out.println(arrChar);



        // 배열의 복사 (실패)
//        int[] originArr = {1, 2, 3};
//        int[] copyArr = originArr;  //이렇게 하면 복사가 아닌 둘이 완전히 동일한 배열임
//
//        copyArr[1] = 555;
//        System.out.println(originArr[1]);   // 555 출력(copyArr를 바꿨음에도 originArr도 바뀜)

        // for문을 이용한 복사 (되는데 효율이 나쁨)
//        int[] originArr = {1, 2, 3};
//        int[] copyArr = new int[originArr.length];
//        for(int i = 0; i < originArr.length; i++) {
//            copyArr[i] = originArr[i];
//        }
//        copyArr[1] = 55;
//        System.out.println(originArr[1]);  // 2가 출력 ( 변경되지 않음)

        // System.arraycopy() 이용해서 깊은 복사 , 파라미터 5개 필요
//        int[] originArr = {1, 2, 3};
//        int[] copyArr = new int[originArr.length * 2];
//        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
//        copyArr[1] = 55;
//        System.out.println(originArr[1]);

        // Arrays.copyOf() 이용해서 깊은 복사 , 파라미터 2개 필요
        int[] originArr = {1, 2, 3};
        int[] copyArr = new int[originArr.length * 2];
        Arrays.copyOf(originArr, originArr.length);
        copyArr[1] = 55;
        System.out.println(originArr[1]);



        // 다차원 배열
        int[][] arrMD = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };
        System.out.println(arrMD[2][2]);



        // 배열의 API
        int[] arrInt1 = {1, 2, 3};
        int[] arrInt2 = {1, 2, 3, 4};
        // 배열의 길이 반환
        System.out.println(arrInt1.length);

        // 배열이 같은지 비교
        // 1차원 배열을 비교할 땐 equals를 사용
        System.out.println(Arrays.equals(arrInt1, arrInt2));

        int[][] arrIntDM1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] arrIntDM2 = { {1, 2, 3}, {4, 5, 6} };
        // 다차원 배열을 비교할 땐 deepEquals를 사용
        System.out.println(Arrays.deepEquals(arrIntDM1, arrIntDM2));



        // 배열의 정렬 ( 원본이 정렬되므로 주의  ==> arrSort 자체가 바뀜)
        int[] arrSort = {5, 2, 76, 89, 1, 2};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));


    }
}
