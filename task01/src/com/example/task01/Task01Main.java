package com.example.task01;

        import java.io.ByteArrayInputStream;
        import java.io.IOException;
        import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checkSum = 0;
        int currentByte;

        try {
            while ((currentByte = inputStream.read()) != -1) {
                checkSum = Integer.rotateLeft(checkSum, 1) ^ currentByte;
            }
        } catch (Exception e) {
            if (e instanceof IOException)
                throw e;
            else
                throw new IllegalArgumentException();
        }

        return checkSum;
    }
}