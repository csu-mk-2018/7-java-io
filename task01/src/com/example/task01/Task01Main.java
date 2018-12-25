package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

       // System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checktmp = 0;
        int Byte;

        try {
            while ((Byte = inputStream.read()) != -1) {
                checktmp = Integer.rotateLeft(checktmp, 1) ^ Byte;
            }
        } catch (Exception excep) {
            if (excep instanceof IOException)
                throw excep;
            else
                throw new IllegalArgumentException();
        }

        return checktmp;
    }
}
