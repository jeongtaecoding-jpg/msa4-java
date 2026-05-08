package com.msa4java.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String str = "jeongtaekode12314";
        String pattern1 = "[a-zA-Z]+";
        String pattern2 = "[0-9]+";

        // 앞쪽 : [a-z0-9] 패턴으로 제한을 함(뛰어쓰기는 하면 안됨! 뛰어쓰기를 허용할 경우가 아니면)
        // 뒤쪽 : 최소 6글자, 최대 20글자를 지켜야함
        String pattern3 = "[a-z0-9]{6,20}";

        // 작성한 문자열에 특정한 패턴을 지켰는지 확인
        System.out.println(str.matches(pattern1));
        System.out.println(str.matches(pattern2));
        System.out.println(str.matches(pattern3));

        // Pattern 객체 이용
        Pattern pattern4 = Pattern.compile("[a-zA-Z]+");

        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher4.matches());

    }
}
