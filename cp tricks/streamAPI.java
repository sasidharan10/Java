import java.util.*;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String[] args) {
        // 1. filter()
        // Filters the elements of the stream based on a given predicate.
        System.out.println("\n1. filter(): ");
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "filter");

        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(System.out::println); // Output: stream, filter

        // 2. map()
        // Transforms each element of the stream using a given function.
        System.out.println("\n2. map(): ");
        words = Arrays.asList("hello", "world", "java", "stream");

        words.stream()
                .map(String::toUpperCase)
                .forEach(n -> System.out.print(n + ", ")); // Output: HELLO, WORLD, JAVA, STREAM

        // 3. flatMap()
        // Flattens the resulting streams into a single stream.
        System.out.println("\n\n3. flatMap(): ");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i"));

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::print); // Output: a, b, c, d, e, f, g, h, i

        // 4. distinct()
        // Returns a stream with unique elements (removes duplicates).
        System.out.println("\n\n4. distinct(): ");
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        numbers.stream()
                .distinct()
                .forEach(System.out::print); // Output: 1, 2, 3, 4, 5

        // 5. sorted()
        // Returns a stream with elements sorted in natural order or using a custom
        // comparator.
        System.out.println("\n\n5. sorted(): ");
        numbers = Arrays.asList(5, 3, 7, 1, 2, 9, 8, 3, 6, 4);

        words.stream()
                .sorted()
                .forEach(n -> System.out.print(n + ", ")); // Output: apple, banana, grape, orange

        // 6. limit()
        // Returns a stream with a maximum number of elements.
        System.out.println("\n\n6. limit(): ");
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + ", ")); // Output: 1, 2, 3, 4, 5

        // 7. skip()
        // Returns a stream with the first n elements discarded.
        System.out.println("\n\n7. skip(): ");
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + ", ")); // Output: 6, 7, 8, 9, 10

        // 8. collect()
        // Converts the stream to a different form, often a collection.
        System.out.println("\n\n8. collect(): ");
        words = Arrays.asList("apple", "banana", "cherry", "apple");

        Set<String> wordSet = words.stream()
                .collect(Collectors.toSet());

        wordSet.forEach(n -> System.out.print(n + ", ")); // Output: apple, banana, cherry

        // 9. reduce()
        // Performs a reduction on the elements of the stream using an associative
        // accumulation function.
        System.out.println("\n\n9. reduce(): ");

        numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum); // Output: Sum: 15

        // 10. forEach()
        // Performs an action for each element of the stream.
        System.out.println("\n10. forEach(): ");

        words = Arrays.asList("hello", "world", "java", "stream");

        words.stream()
                .forEach(n -> System.out.print(n + ", ")); // Output: hello, world, java, stream

        // 11.Boxed
        // The boxed() method is used to convert an IntStream to a Stream<Integer>

        System.out.println("\n\n11. boxed(): ");
        int[] array = { 5, 3, 8, 1, 9, 2 };

        int[] sortedArray = Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(sortedArray));

    }
}

/*
 
 - There uses of Stream in Java are mentioned below:
 - Stream API is a way to express and process collections of objects.
 - Enable us to perform operations like filtering, mapping, reducing and
 sorting.
 
- The boxed() method in Java is used to convert an IntStream (which is a stream of primitive 
  int values) to a Stream<Integer> (which is a stream of Integer objects).

- Here's why you might need to use boxed() in the context of sorting an array in reverse order:

- Primitive Streams: IntStream is a stream specifically for int primitives and does not support 
operations that require object-based methods, such as using Comparator for sorting in reverse order.
- Object-Based Operations: By converting the IntStream to a Stream<Integer> using boxed(), you 
can then use object-based methods like sorted(Collections.reverseOrder()), which requires 
objects rather than primitives.

 */