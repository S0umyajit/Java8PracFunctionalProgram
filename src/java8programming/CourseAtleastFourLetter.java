package java8programming;

import java.util.List;

public class CourseAtleastFourLetter {

    public static void main(String[] args) {
        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");
        printCourses(courses);
    }
    private static void printCourses(List<String> courses) {
        courses.stream()
                .filter(s->s.length()>=4)
                .forEach(System.out::println);
        }
    }

