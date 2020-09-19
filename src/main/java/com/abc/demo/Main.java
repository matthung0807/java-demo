package com.abc.demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] arges) {
        String path = System.getProperty("user.home") + "/Documents/tmp/test.txt";
        new Main().writeFile("hello world", path);
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

}
