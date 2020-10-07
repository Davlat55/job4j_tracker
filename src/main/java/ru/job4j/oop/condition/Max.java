package ru.job4j.oop.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maximum = left > right;
        int result = maximum ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        int temp = Max.max(right, third);
        return max(left, temp);
    }

    public static int max(int left, int right, int third, int fourth) {
        int temp = max(third, fourth);
        temp = max(right, temp);
        return max(left, temp);
    }
}
