package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        System.out.println(checkSumOfStream(inputStream));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checkSum = 0;
        int rByte; //текущий считанный байт

        try {
            while ((rByte = inputStream.read()) >= 0)
                checkSum = Integer.rotateLeft(checkSum, 1) ^ rByte;
        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }

        return checkSum;
    }
}