package java8programming;

import java.util.List;

public class FunctionalProgramPrac {

    public static void main(String[] args) {

        printAllListOfElement(List.of(2,3,4,6,7,8,90,1));
    }

    public static void print (int number){
        System.out.println(number);
    }
    private static void printAllListOfElement(List<Integer> numbers) {

//        for(int num:numbers){
//            System.out.println(num);
//        }
        numbers.stream()
                .forEach(FunctionalProgramPrac::print); //Method reference
    }
}
