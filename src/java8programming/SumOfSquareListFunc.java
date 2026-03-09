package java8programming;

import java.util.List;

public class SumOfSquareListFunc {
    public static void main(String[] args) {

        List<Integer>numbers= List.of(1,2,3,4,5);

        int res=sumOfSquare(numbers);

        System.out.println(res);
    }

    private static int sumOfSquare(List<Integer> numbers) {

        return numbers.stream()
                .map(n->n*n)
                .reduce(0,(a,b)->a+b);
    }
}
