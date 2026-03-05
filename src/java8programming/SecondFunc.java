package java8programming;

import java.util.List;

public class SecondFunc {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8);
        printEvenNumber(numbers);
    }

//    public static boolean isEven(int num){
//
//        return num%2==0;
//    }

    private static void printEvenNumber(List<Integer> numbers) {

//        for(int num:numbers){ //Normal flow
//            if(num%2==0){
//                System.out.println(num);
//            }
//        }
//Functional Programming flow
//       numbers.stream()
//               .filter(SecondFunc::isEven) //filter to get only even number
//               .forEach(System.out::println);

        numbers.stream()
                .filter(n->n%2==0) //filter to get only even number
                .forEach(System.out::println);
    }
}
