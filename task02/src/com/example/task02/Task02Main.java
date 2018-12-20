package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentByte = System.in.read();
        int nextByte;

        while (currentByte >= 0) {
            nextByte = System.in.read();
            if (!(nextByte == 10 && currentByte == 13)) {
                System.out.write(currentByte);
            }
            currentByte = nextByte;
        }
        System.out.flush();
    }
}
