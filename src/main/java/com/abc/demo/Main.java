package com.abc.demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

//    @SneakyThrows(IOException.class)
    public static void main(String[] arges) {

    }

    void writeFile(String str, String path) {
        byte[] data = str.getBytes();
        write(data, path);
    }

    @SneakyThrows(IOException.class)
    void write(byte[] data, String path) {
        File file = new File(path);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
        }
    }

//    void write(byte[] data, String path) {
//        File file = new File(path);
//        try (FileOutputStream fos = new FileOutputStream(file)) {
//            fos.write(data); // 寫出檔案
//        } catch (IOException e) {
//            // 例外處理
//        }
//    }

//    void write(byte[] data, String path) throws IOException {
//        File file = new File(path);
//        try (FileOutputStream fos = new FileOutputStream(file)) {
//            fos.write(data); // 寫出檔案
//        }
//    }

}
