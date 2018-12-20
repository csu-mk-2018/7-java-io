package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        convertEndOfStringBytes(System.in, System.out);
    }

    public static void convertEndOfStringBytes(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null || outputStream == null) {
            throw new IllegalArgumentException();
        }
        int current = inputStream.read();
        while (current >= 0) {
            int next = inputStream.read();
            if (!(current == '\r' && next == '\n')) {
                outputStream.write(current);
            }
            current = next;
        }
        outputStream.flush();
    }
}
