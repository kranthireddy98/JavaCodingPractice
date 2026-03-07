package streams;

import java.util.*;
import java.util.stream.Collectors;

public class evenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,7,2,8,10,5,6);

        List<Integer> even= numbers.stream()
                .filter((e) -> e%2 ==0)
                .collect(Collectors.toList());

        long count = numbers.stream()
                        .filter(e -> e%2==0)
                                .count();
        System.out.println(even);
        System.out.println(count);

        List<Integer> sqrd = numbers.stream()
                .map(e -> e * e)
                .toList();
        int sumsqrd  = numbers.stream()
                        .map(n -> n * n)
                                .reduce(0,(a,b) -> a+b);

        System.out.println(sqrd);
        System.out.println(sumsqrd);

        List<Integer> duplicates = List.of(4,5,3,4,4,5,5);

        List<Integer> unique = duplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
        List<Integer> sorted = duplicates.stream()
                        .sorted((a,b)-> b -a)
                                .collect(Collectors.toList());
        List<Integer> sorted1 = duplicates.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted1);

        List<Integer> list = List.of(4,7,2,9,5);

        Optional<Integer> second = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst();

        System.out.println(second.get());
    }
}
