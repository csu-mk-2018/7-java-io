package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevByte = System.in.read();
        int nextByte;

        while (prevByte >= 0) {
            nextByte = System.in.read();
            if (!(prevByte == 13 && nextByte == 10)) {
                System.out.write(prevByte);
            }
            prevByte = nextByte;
        }
        System.out.flush();
    }
}
