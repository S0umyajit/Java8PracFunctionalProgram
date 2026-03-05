package java8programming;

import java.util.List;

public class MapSquareOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8);
        printEvenSquareNumber(numbers);
        printCubeOfEvenNumber(numbers);
        printOddSquareNumber(numbers);
        printOddCubeNumber(numbers);
    }

    private static void printOddCubeNumber(List<Integer> numbers) {
        System.out.println("Cube of Odd Number: ");
        numbers.stream()
                .filter(n->n%2!=0)
                .map(n->n*n*n)
                .forEach(System.out::println);
    }

    private static void printOddSquareNumber(List<Integer> numbers) {
        System.out.println("Square of Odd Number: ");
        numbers.stream()
                .filter(n->n%2!=0)
                .map(n->n*n)
                .forEach(System.out::println);
    }

    private static void printCubeOfEvenNumber(List<Integer> numbers) {
        System.out.println("Cube of Even numbers are: ");
        numbers.stream()
                .filter(n-> n%2==0)
                .map(n->n*n*n)
                .forEach(System.out::println);
    }


    private static void printEvenSquareNumber(List<Integer> numbers) {
        System.out.println("Square of Even number:");
        numbers.stream()
                .filter(n->n%2==0)//filter to get only even number
                .map(n->n*n)
                .forEach(System.out::println);
    }
}