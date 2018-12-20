package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringWriter writer = new StringWriter();
        int currentByte;

        try {
            Reader reader = new InputStreamReader(inputStream, charset);

            while ((currentByte = reader.read()) != -1) {
                writer.write(currentByte);
            }

            return writer.toString();
        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }
    }
}
