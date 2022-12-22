package ru.geekbrains.core.lesson2;

public class MyException extends Exception {

    public MyException(String error) {
        super(error);
    }

    public MyException() {
        super();
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Ошибка размера");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }
}
