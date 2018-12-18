package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        convertWin2Unix(System.in, System.out);
    }

    private static void convertWin2Unix(InputStream inputStream, OutputStream outputStream) throws IOException {
        int currentByte = inputStream.read();
        int nextByte;

        while (currentByte >= 0) {
            nextByte = inputStream.read();
            if (!(nextByte == 10 && currentByte == 13)) { //: /r/n
                outputStream.write(currentByte);
            }
            currentByte = nextByte;
        }
        outputStream.flush();
    }
}
