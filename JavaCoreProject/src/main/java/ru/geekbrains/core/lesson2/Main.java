package ru.geekbrains.core.lesson2;

import ru.geekbrains.core.lesson2.MyException.MyArraySizeException;
import ru.geekbrains.core.lesson2.MyException.MyArrayDataException;

public class Main {

    static String[][] arraySizeException = {{"1", "2"}, {"1", "6",}, {"9", "6"}, {"5", "6"}};
    static String[][] arrayDataException = {{"1", "%", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
    static String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"8", "7", "6", "5"}, {"4", "3", "2", "1"}};

    static int sizeA = 4;
    static int sizeB = 4;

    //MyArraySizeException sizeError = new MyArraySizeException();
    //MyArrayDataException dataError = new MyArrayDataException("Ошибка в позиции: " + i+","+j);

    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива: " + getSumm(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(arrayWithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void checkValue(String[][] array) throws MyArraySizeException {
        if(array.length != sizeA || array[0].length != sizeB) throw new MyArraySizeException();
    }

    static Integer getSumm(String[][] array) throws MyArrayDataException,MyArraySizeException {
        checkValue(array);
        Integer result = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new MyArrayDataException("Ошибка в позиции: " + i + "," + j);
        }
        return result;
    }
}
