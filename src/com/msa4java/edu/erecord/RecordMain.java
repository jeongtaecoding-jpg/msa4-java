package com.msa4java.edu.erecord;

public class RecordMain {
    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO("제목1", "내용1");
        PostRecord postRecord = new PostRecord("제목2", "내용2");

        // Getter 호출

        // 기본은 getTitle() 사용
        System.out.println(postDTO.getTitle());
        // 레코드는 title() 사용
        System.out.println(postRecord.title());

        System.out.println(postDTO.toString());       // 주소 값 출력
        System.out.println(postRecord.toString());    // [title=제목2, content=내용2] 로 출력

    }
}
