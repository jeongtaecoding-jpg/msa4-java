package com.msa4java.edu.erecord;

public class PostDTO {
    private final String title;
    private final String content;

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }



    @Override
    public String toString() {
        return this.getClass().getName();
    }



}
