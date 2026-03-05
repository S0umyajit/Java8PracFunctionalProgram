package java8programming;

import java.util.List;

public class NumOfCharForEachCourse {
    public static void main(String[] args) {
        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");
        printNumOfCharForCourses(courses);
    }

    private static void printNumOfCharForCourses(List<String> courses) {
        courses.stream()
                .map(course->course.length())
                .forEach(System.out::println);
    }


}
