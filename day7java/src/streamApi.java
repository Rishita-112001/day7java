import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Consumer<Integer> con = new Consumer<>() {
            int sum = 0;  // Counting even numbers
            @Override
            public void accept(Integer number) {
                if(number % 2 == 0) {
                    number = number * 2; // Doubling the even number
                    sum += number; // Summing up the even numbers
                }
                System.out.println(sum);
            }
        };

//        // Using Stream API to filter and print even numbers
//        numbers.stream()
//               .filter(n -> n % 2 == 0)
//               .forEach(System.out::println);
//        // Using Stream API to filter, double, and sum even numbers
//        int sum = numbers.stream()
//                         .filter(n -> n % 2 == 0)
//                         .mapToInt(n -> n * 2)
//                         .sum();
//
//        System.out.println("Sum of even numbers: " + sum); // Output: Sum of even numbers: 20

        var stream = numbers.stream();
        var filteredStream = stream.filter(n -> n % 2 == 0);
        var mappedStream = filteredStream.map(n -> n * 2);      // Double the even numbers
        var sum = mappedStream.reduce(0, (a, b) -> a + b);  // Sum up the even numbers

        //or

        var sum1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .reduce(0, (a, b) -> a + b); // Sum of even numbers

        System.out.println("Sum of even numbers separate line code: " + sum); // Output: Sum of even numbers: 20
        System.out.println("Sum of even numbers inline: " + sum1); // Output: Sum of even numbers: 20

    }
}
