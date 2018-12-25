package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int curByte = System.in.read();
        int nextByte;
        while (curByte != -1) {
            nextByte = System.in.read();
            if (nextByte != '\n' || curByte != '\r') {
                System.out.write(curByte);
            }
            curByte = nextByte;
        }
        System.out.flush();
    }
}
