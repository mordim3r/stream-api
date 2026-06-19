import java.util.List;

public class one {
    public static void main(String[] args) {
//        Уровень 1 — один метод
//        Задача 1. Есть список чисел. Выведи каждое через System.out.println.
//                List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//// → 1  2  3  4  5

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);




    }
}
