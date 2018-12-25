package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }


    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int totalSum = 0;
        try {
            int readByte = inputStream.read();
            while (readByte != -1) {
                totalSum = Integer.rotateLeft(totalSum, 1) ^ readByte;
                readByte = inputStream.read();
            }
        } catch (Exception e) {
            if (e instanceof IOException)
                throw e;
            else
                throw new IllegalArgumentException();
            }
        return totalSum;
    }
}





