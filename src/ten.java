import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ten {
    //Задача 10. Построй Map<Integer, List<String>>, где ключ — длина слова,
    // значение — список слов этой длины.
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "bear", "duck", "ox");
        Map <Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(s->s.length()));
        System.out.println(result);
    }
}
