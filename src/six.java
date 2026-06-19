import java.util.List;
import java.util.Optional;
// Найди первое число, которое делится на 7. Результат — Optional<Integer>.
public class six {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 14, 21, 5, 49);
        Optional<Integer> result =numbers.stream()
                .filter(n->n%7==0)
                .findFirst();
        System.out.println(result);

    }
}
