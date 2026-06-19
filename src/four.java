import java.util.List;

public class four {
    public static void main(String[] args) {
        //Задача 4. Оставь только чётные числа и возведи каждое в квадрат.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer>result = numbers.stream().filter(n->n%2==0).map(n->n*n).toList();
        System.out.println(result);


    }
}
