import java.util.List;

public class fifteen {
    public static void main(String[] args) {
       // Задача 15. Убери дубликаты из списка, сохрани порядок первого появления.
        List<Integer> numbers = List.of(1, 3, 2, 1, 4, 3, 5);
        List<Integer> result = numbers.stream().distinct().toList();
        System.out.println(result);


    }
}
