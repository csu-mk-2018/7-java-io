package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringWriter strWrite = new StringWriter();
        int readByte;
        try {
            Reader reader = new InputStreamReader(inputStream, charset);
            readByte = reader.read();
            while (readByte != -1) {
                strWrite.write(readByte);
                readByte = reader.read();

            }
        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();

        }

        return strWrite.toString();
    }
}
