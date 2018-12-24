package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int currentByte;
        int nextByte;

        currentByte = System.in.read();
        while (currentByte != -1) {
            nextByte = System.in.read();
            if (currentByte != '\r' || nextByte != '\n') {
                System.out.write(currentByte);
            }
            currentByte = nextByte;
        }
    }
}
