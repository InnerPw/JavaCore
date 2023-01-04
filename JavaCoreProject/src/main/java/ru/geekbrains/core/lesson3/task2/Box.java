package ru.geekbrains.core.lesson3.task2;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    ArrayList<T> theBox;

    public Box(ArrayList<T> theBox) {
        this.theBox = theBox;
    }

    //количество фруктов в коробке
    public Integer getTheBoxContentArray() {
        Integer result = 0;
        for (T box : theBox) {
            if(box!=null) {
                Integer value = box.getFruitsValue();
                result = result + value;
            }
        }
        return result;
    }

    //узнать какие фрукты лежат в коробке
    public String getTheBoxFruitName() {
        String result = null;
        for (T box : theBox) {
            if(box!=null) {
                String value = box.getName();
                result = value;
            }
        }
        return result;
    }

    //узнать вес содержимого коробки
    public float getWeight(){
        int weight = this.getTheBoxContentArray();
        float result = 0;
        switch (this.getTheBoxFruitName()) {
            case "Apple": {
                result = weight * 1.0f;
                break;
            }
            case "Orange": {
                result = weight * 1.5f;
                break;
            }
        }
        return result;
    }

    //сравнение по количеству содержимого коробок
    public Boolean compare(Box<? extends Fruit> box){
        if(this.getTheBoxContentArray().intValue() == box.getTheBoxContentArray().intValue()) {
            return true;
        } else {
            return false;
        }
    }

    //сравнение по весу коробок
    public Boolean weightCompare(Box<? extends Fruit> box){
        if(this.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<T> getTheBox() {
        return theBox;
    }
}
