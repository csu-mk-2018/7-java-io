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
        convertEndOfString(System.in, System.out);

    }
    public static void convertEndOfString(InputStream inputStr, OutputStream outputStr) throws IOException {
        if (inputStr == null || outputStr == null) {
            throw new IllegalArgumentException();
        }
        int tmpCurr = inputStr.read();
        while (tmpCurr >= 0) {
            int tmpNext = inputStr.read();
            if (!(tmpCurr == '\r' && tmpNext == '\n')) {
                outputStr.write(tmpCurr);
            }
            tmpCurr = tmpNext;
        }
        outputStr.flush();
    }
}
