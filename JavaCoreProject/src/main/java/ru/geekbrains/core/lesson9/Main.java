package ru.geekbrains.core.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> result = getListOfStudents(3,3);
        //1 задание
        List<Course> uniqueCourses = result.stream().flatMap(student -> student.getCourseList().stream()).distinct().collect(Collectors.toList());
        //result.stream().flatMap(student -> student.getCourseList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourseList().stream()).collect(Collectors.toSet());

        for (Course course : uniqueCourses) {
            System.out.println(String.valueOf(course.getName()));
        }

        System.out.println();

        //2 задание
        List<Student> outputStudentsMaxCourses = result.stream().sorted((student1,student2) -> student1.getCourseList().size() - student2.getCourseList().size()).limit(3).collect(Collectors.toList());

        for (Student student : outputStudentsMaxCourses) {
            System.out.println(String.valueOf(student.getName()));
        }

        System.out.println();


        //3 задание
        Course paramCourse = new Course("course1");

        List<Student> outputStudentsForCourse = result.stream().filter(student -> student.getCourseList().contains(paramCourse)).collect(Collectors.toList());

        for (Student student : outputStudentsForCourse) {
            System.out.println(String.valueOf(student.getName()));
        }

    }

    private static List<Student> getListOfStudents(int j, int m) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Course> courses = new ArrayList<>();
            for (int h=0; h<m ;h++){
                courses.add(new Course("course"+h));
            }
            result.add(new Student("student"+i, courses));
        }
        return result;
    }
}

