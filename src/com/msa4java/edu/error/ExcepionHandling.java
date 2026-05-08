package com.msa4java.edu.error;

public class ExcepionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");

            // 에러
          double result = 10 / 0;
//             정상
//            double result = 10 / 2;

            System.out.println("트라이 끝");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 에러");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("캐치 들어옴");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("파이널리");
        }
    }
}
