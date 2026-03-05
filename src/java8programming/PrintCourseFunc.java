package java8programming;

import java.util.List;

public class PrintCourseFunc {

    public static void main(String[] args) {
        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");

        printCourses(courses);

    }
    public static void print(String course){
        System.out.println(course);
    }

    private static void printCourses(List<String> courses) {
        courses.stream()
                .forEach(PrintCourseFunc::print);
    }
}
