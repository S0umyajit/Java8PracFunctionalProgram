package java8programming;

import java.util.List;

public class SumOfCubeFunc {

    public static void main(String[] args) {

        List<Integer> numbers= List.of(1,2,3);

        int result=cubeSumFunc(numbers);

        System.out.println(result);
    }

    private static int cubeSumFunc(List<Integer> numbers) {

        return numbers.stream()
                .map(n->n*n*n)
                .reduce(0,(a,b)->a+b);
    }
}
