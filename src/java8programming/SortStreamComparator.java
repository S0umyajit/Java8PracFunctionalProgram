package java8programming;

import java.util.Comparator;
import java.util.List;

public class SortStreamComparator {
    public static void main(String[] args) {

        List<String> course= List.of("Spring Boot","Sprig", "API","AWS","Azure","Docker");
        System.out.println("============================Natural Order=================================");
        sortUsingComparator(course);
        System.out.println("============================Reverse Order==================================");
        sortUsingComparatorReverse(course);

        List<Integer> nums=List.of(1,2,3,4,7,30,12,9);
        System.out.println("============================Number in ascending Order=========================");
        testComparatorAscending(nums);
        System.out.println("============================Number in descending Order=========================");
        testComparatorDescending(nums);
    }
    private static void testComparatorDescending(List<Integer> nums) {

//        nums.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
        nums.stream()
                .sorted(Comparator.comparingInt((Integer y)->y).reversed())
                .forEach(System.out::println);
    }
    private static void testComparatorAscending(List<Integer> nums) {
        nums.stream()
                .sorted(Comparator.comparingInt(x->x))
                .forEach(System.out::println);
    }
    private static void sortUsingComparatorReverse(List<String> course) {
        course.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
    private static void sortUsingComparator(List<String> course) {

        course.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
