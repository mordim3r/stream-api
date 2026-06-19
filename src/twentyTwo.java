import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class twentyTwo {
    public static void main(String[] args) {
      //  Задача 22. Раздели список чисел на два: чётные и нечётные. Результат — Map<Boolean, List<Integer>>.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map <Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result);

    }
}
