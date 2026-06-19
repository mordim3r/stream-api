import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class twenty {
    public static void main(String[] args) {
        //Задача 20. Найди среднее арифметическое списка чисел.
        List<Integer> numbers = List.of(10, 20, 30, 40);
        OptionalDouble result = numbers.stream()
                .mapToInt(n->n).average();
        System.out.println(result.getAsDouble());


    }
}
