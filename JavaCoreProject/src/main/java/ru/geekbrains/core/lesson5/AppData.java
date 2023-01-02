package ru.geekbrains.core.lesson5;

import java.io.*;

public class AppData {

    private String[] header;
    private int[][] data;

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

    public void show() {
        System.out.println(getHeader()[0] + "; " + getHeader()[1] + "; " + getHeader()[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(getData()[i][0] + "; " + getData()[i][1] + "; " + getData()[i][2]);
        }
    }
}
