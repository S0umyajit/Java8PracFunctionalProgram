package java8programming;

import java.util.List;

public class MaxNumFunc {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(12,3,4,67,44,678,89,13);

        int maxNum=maxNumList(numbers);
        System.out.println(maxNum);
    }
    private static int maxNum(int a,int b){
        return Math.max(a,b);
    }
    private static int maxNumList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,MaxNumFunc::maxNum);

    }
}
