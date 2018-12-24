package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;
        int rByte;

        try {
            while ((rByte = inputStream.read()) != -1) {
                checksum = Integer.rotateLeft(checksum, 1) ^ rByte;
            }
        } catch (Exception e) {
            if (e instanceof IOException)
                throw e;
            else
                throw new IllegalArgumentException();
        }

        return checksum;
    }
}
