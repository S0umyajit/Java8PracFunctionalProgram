package java8programming;

import java.util.List;

public class SumOfOddListFunc {

    public static void main(String[] args) {

        List<Integer> nums= List.of(1,2,3,4,5);
        int ans=sumOfOdd(nums);
        System.out.println(ans);
    }

    private static int sumOfOdd(List<Integer> nums) {

        return nums.stream()
                .filter(n->n%2!=0)
                .reduce(0,Integer::sum);
    }
}
