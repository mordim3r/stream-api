import java.util.List;

public class seventeen {
    public static void main(String[] args) {
        //Задача 17. Пропусти первые 2 элемента и верни остаток.
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        List<Integer> result = numbers.stream().skip(2).toList();
        System.out.println(result);

    }
}
