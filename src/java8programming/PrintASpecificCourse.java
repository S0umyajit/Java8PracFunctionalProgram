package java8programming;

import java.util.List;

public class PrintASpecificCourse {

    public static void main(String[] args) {
        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");
        printCourses(courses);

    }
    private static void printCourses(List<String> courses) {
        courses.stream()
                .filter(s->s.contains("Spring"))
                .forEach(System.out::println);
    }
}
