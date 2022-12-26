package ru.geekbrains.core.lesson3.task1;

public class SwapClass <T> {
    T temporary;

    public T[] swapper(T[] array, int valueA, int valueB) {
        temporary = array[valueA];
        array[valueA] = array[valueB];
        array[valueB] = temporary;
        return array;
    }

}
