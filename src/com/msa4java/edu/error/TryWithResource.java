package com.msa4java.edu.error;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(
                FileWriter file = new FileWriter("text.txt");
        ) {
            file.write("안녕");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // TryWithResource을 안 쓰고 하면 이렇게 복잡하게 됨.
//        FileWriter file = null;
//        try {
//            file = new FileWriter("test.txt");
//            file.write("안녕");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                file.close();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
