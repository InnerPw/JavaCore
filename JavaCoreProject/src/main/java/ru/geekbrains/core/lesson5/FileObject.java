package ru.geekbrains.core.lesson5;

public class FileObject {

    private Integer value = 1;
    private Integer valueFrom = 2;
    private Integer valueTo = 3;

    public FileObject(Integer value, Integer valueFrom, Integer valueTo) {
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getValueFrom() {
        return valueFrom;
    }

    public Integer getValueTo() {
        return valueTo;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setValueFrom(Integer valueFrom) {
        this.valueFrom = valueFrom;
    }

    public void setValueTo(Integer valueTo) {
        this.valueTo = valueTo;
    }
}
