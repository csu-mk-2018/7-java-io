package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.*;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String retval;
        StringWriter r = new StringWriter();
        int b;

        try {
            Reader reader = new InputStreamReader(inputStream, charset);

            while ((b = reader.read()) != -1) {
                r.write(b);
            }

            retval = r.toString();
            return retval;
        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }
    }
}
