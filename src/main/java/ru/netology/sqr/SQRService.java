package ru.netology.sqr;

public class SQRService {
    public int calculateSqrCount(int left, int right) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= left && i * i <= right) {
                count++;
            }
        }
        return count;
    }
}
