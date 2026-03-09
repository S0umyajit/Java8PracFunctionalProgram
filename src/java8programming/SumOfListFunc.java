package java8programming;

import java.util.List;

public class SumOfListFunc {

    public static void main(String[] args) {
        List<Integer> nums= List.of(1,2,3,4,5,6);

        int sum=addListFunc(nums);
        System.out.println("List of distinct Num: "+ sum);
    }
    private static int sum(int a, int b){
        return a+b;
    }
    private static int addListFunc(List<Integer> nums) {
        return nums.stream()
                .reduce(0,SumOfListFunc::sum);
    }
}
