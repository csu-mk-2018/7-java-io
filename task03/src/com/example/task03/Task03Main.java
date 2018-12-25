package com.example.task03;

        import java.io.*;
        import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringWriter stringWriter = new StringWriter();
        int currentByte;

        try {
            Reader reader = new InputStreamReader(inputStream, charset);

            while ((currentByte = reader.read()) != -1) {
                stringWriter.write(currentByte);
            }
            return stringWriter.toString();

        } catch (Exception e) {
            if (e instanceof IOException)
                throw new IOException();
            else
                throw new IllegalArgumentException();
        }
    }
}