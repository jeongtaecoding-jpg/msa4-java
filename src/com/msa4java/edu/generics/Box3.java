package com.msa4java.edu.generics;

import java.util.ArrayList;
import java.util.List;

public class Box3<T, S> {
    public List<T> item = new ArrayList<>(10);
    // 빈칸으로 해놓으면 ArrayList가 List의 T를 자동으로 가져옴

    public S test(S s) {
        return s;
    }

}
