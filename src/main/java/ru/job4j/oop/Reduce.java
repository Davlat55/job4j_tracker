package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array2) {                   // здесь переименовал array на array2, имя совпадал с именем поля
        array = array2;                              // и здесь ее присвоил на поле класса
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
