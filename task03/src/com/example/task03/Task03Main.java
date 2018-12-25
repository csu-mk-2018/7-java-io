package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


       // System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStr, Charset charset) throws IOException {
        StringWriter stringWriter = new StringWriter();
        int Byte;

        try {
            Reader reader = new InputStreamReader(inputStr, charset);

            while ((Byte = reader.read()) != -1) {
                stringWriter.write(Byte);
            }
            return stringWriter.toString();

        } catch (Exception excep) {
            if (excep instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }
    }
}
