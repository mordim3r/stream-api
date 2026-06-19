import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class thirteen {
    public static void main(String[] args) {


        //  Задача 13. Найди максимальное число в списке.
        List<Integer> numbers = List.of(3, 99, 7, 42, 1);
        OptionalInt max = numbers.stream()
                .mapToInt(n->n).max();
        System.out.println("max = "+max);

        OptionalInt min = numbers.stream()
                .mapToInt(n->n).min();
        System.out.println("min ="+min.getAsInt() );
    }

}
