package ru.geekbrains.core.lesson5;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static ArrayList<FileObject> fileObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "JavaCoreProject/src/main/resources/lesson5.csv";
    public static final String title = "value1" + "; " + "value2" + "; " + "value3" + ";" + System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        //File fileCSV = new File("src/main/resources/lesson5.csv");

        //System.out.println(fileCSV.getName());
        //System.out.println(fileCSV.exists());
        //System.out.println(fileCSV.isDirectory());

        createFileObjects();
        writer();
        //writeStream();

        AppData appData = readToObject();


    }

    public static void createFileObjects() throws IOException {
        for(int i=1; i<4; i++){
            fileObjectArrayList.add(new FileObject(i, i*16, i*1000));
        }
    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile)){
            writer.write(title);
            for(FileObject fileObject : fileObjectArrayList) {
                writer.write(fileObject.getValue() + ";" + fileObject.getValueFrom() + ";" + fileObject.getValueTo() + ";" + System.getProperty("line.separator"));
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }

}
