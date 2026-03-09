package java8programming;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");

        int max_len=longestCourse(courses);
        System.out.println(max_len);
        String maxLenCourse=longestCourseName(courses);
        System.out.println("max lenth course name: "+maxLenCourse);
    }

    private static String longestCourseName(List<String> courses) {
        return courses.stream()
                .reduce("",(n1,n2)->n1.length()>n2.length()?n1:n2);
    }

    private static int longestCourse(List<String> courses) {

        return courses.stream()
                .reduce("", (n, n1) -> n.length() > n1.length() ? n : n1)
                .length();
    }
}
