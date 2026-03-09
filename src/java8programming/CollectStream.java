package java8programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {

    public static void main(String[] args) {

        List<Integer> numbers= List.of(1,2,2,3,4,6,9,7,8);
        List<String> courses= List.of("Spring","Spring Boot","Microservice","AWS","Docker");

        List<Integer> doubleList=doubleList(numbers);
        System.out.println(doubleList);
        List<Integer> evenNum=evenNumList(numbers);
        System.out.println("Even Number List: "+evenNum);
        List<Integer> len=courselength(courses);
        System.out.println("Each course length: "+len);

    }

    private static List<Integer> courselength(List<String> courses) {

        return courses.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumList(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .filter(n->n%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {

        return numbers.stream()
                .map(n->n * n)
                .collect(Collectors.toList());
    }
}
