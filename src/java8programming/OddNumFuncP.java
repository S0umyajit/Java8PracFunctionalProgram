package java8programming;

import java.util.List;

public class OddNumFuncP {

    public static void main(String[] args) {

        printOddNum(List.of(1,2,3,4,5,6,7,8,9));

    }
    private static void printOddNum(List<Integer> numbers) {
        numbers.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
        }
    }

