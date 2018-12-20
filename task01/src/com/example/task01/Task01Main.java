package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checkSum = 0;
        int currentByte;

        try {
            while ((currentByte = inputStream.read()) >= 0)
                checkSum = Integer.rotateLeft(checkSum, 1) ^ currentByte;
        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }

        return checkSum;
    }
}
