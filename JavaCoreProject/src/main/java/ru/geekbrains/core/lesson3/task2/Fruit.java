package ru.geekbrains.core.lesson3.task2;

public abstract class Fruit {

    private String name;
    private Integer fruitsValue;

    public Fruit(String name, Integer fruitsValue) {
        this.name = name;
        this.fruitsValue = fruitsValue;
    }

    public String getName() {
        return name;
    }

    public Integer getFruitsValue() {
        return fruitsValue;
    }
}
