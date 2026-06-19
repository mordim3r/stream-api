import java.util.List;

public class eleven {
    public static void main(String[] args) {
//        Задача 11. Проверь, есть ли в списке хоть одно отрицательное число.
//                Результат — boolean.
        List<Integer> numbers = List.of(3, -1, 7, 2);
        boolean result = numbers.stream()
                .anyMatch(n->n<0);
        System.out.println(result);


    }
}
