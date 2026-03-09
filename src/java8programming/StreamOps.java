package java8programming;

import java.util.List;

public class StreamOps {

    public static void main(String[] args) {
        List<Integer> num= List.of(9,2,3,4,5,6,7,8,9,4,2,1,3);

        printDistinctNum(num);
        List<String> course=List.of("Spring Boot","Sprig", "API","AWS","Azure","Docker");
        System.out.println("List of sorted courses: ");
        sortedList(course);
    }

    private static void sortedList(List<String> course) {
        course.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void number(int a){
        System.out.println(a);
    }
    private static void printDistinctNum(List<Integer> num) {

        num.stream()
                .distinct()
                .sorted()
                .forEach(StreamOps::number);
    }
}
