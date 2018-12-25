package com.example.task01;

import java.io.*;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int controlSum = 0;
        int rByte;
        try {
            while ((rByte = inputStream.read()) >= 0) {
                controlSum = Integer.rotateLeft(controlSum, 1) ^ rByte;
            }
        } catch (Exception e) {
            if (e.getClass().equals(IOException.class))
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }
        return controlSum;
    }
}