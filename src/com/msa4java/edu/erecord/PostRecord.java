package com.msa4java.edu.erecord;

public record PostRecord(
        String title
        ,String content
) {
    // 아래 메소드는 자동으로 만들어진다. (그러나 "aa"같은 걸 추가하려면 아래와 같이 따로 재정의해야 한다.)
    public PostRecord(String title, String content) {
        this.title = title + "aa";
        this.content = content;
    }
}
