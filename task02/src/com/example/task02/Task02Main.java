package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        convertToUnix(System.in, System.out);
    }

    private static void convertToUnix(InputStream inputStream, OutputStream outputStream) throws IOException {
        int cByte = inputStream.read();
        int nextByte;

        while (cByte >= 0) {
            nextByte = inputStream.read();
            if (!(nextByte == 10 && cByte == 13)) {
                outputStream.write(cByte);
            }
            cByte = nextByte;
        }
        outputStream.flush();
    }
}