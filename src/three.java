import java.util.List;

public class three {
    //Задача 3. Оставь только числа больше 10.
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 15, 7, 22, 1, 18);
        List <Integer> result = numbers.stream().filter(n->n>10).toList();
        System.out.println(result);
    }
}
