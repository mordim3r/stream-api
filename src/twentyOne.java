import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class twentyOne {
    public static void main(String[] args) {
//        Задача 21. Преобразуй список строк в Map<String, Integer>, где значение — длина строки.
//        Если строки повторяются — оставь первую.
        List<String> words = List.of("cat", "bear", "dog", "cat");
        Map<String, Integer> result = words.stream().collect(Collectors.toMap(
                s->s,
                s -> s.length(),
                (first,second)->first
                ));
        System.out.println(result);


    }
}