package ru.geekbrains.core.lesson3.task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Apple> applesBox = new ArrayList<>(15);
        ArrayList<Orange> orangesBox = new ArrayList<>(15);

        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Apple apple3 = new Apple(1);

        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(1);
        Orange orange3 = new Orange(1);


        applesBox.add(apple1);
        applesBox.add(apple2);
        applesBox.add(apple3);

        orangesBox.add(orange1);
        orangesBox.add(orange2);
        orangesBox.add(orange3);

        Box<Apple> box1 = new Box<>(applesBox);

        Box<Orange> box2 = new Box<>(orangesBox);

        System.out.println(box1.getTheBoxContentArray());
        System.out.println(box2.getTheBoxContentArray());

        System.out.println(box1.getTheBoxFruitName());
        System.out.println(box2.getTheBoxFruitName());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compare(box2));

        System.out.println(box1.weightCompare(box2));

    }
}
