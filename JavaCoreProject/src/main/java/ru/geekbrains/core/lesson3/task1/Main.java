package ru.geekbrains.core.lesson3.task1;

import java.util.Arrays;

public class Main {

    static Integer[] arrayInteger = {1, 2, 3, 4};
    static Double[] arrayDouble = {1d, 2d, 3d, 4d};
    static String[] arrayString = {"1", "2", "3", "4"};

    public static void main(String[] args) {

        SwapClass<Object> swapClass = new SwapClass<>();

        System.out.println(Arrays.toString(swapClass.swapper(arrayInteger, 3, 3)));
        System.out.println(Arrays.toString(swapClass.swapper(arrayDouble, 2, 1)));
        System.out.println(Arrays.toString(swapClass.swapper(arrayString, 0, 1)));

    }
}
