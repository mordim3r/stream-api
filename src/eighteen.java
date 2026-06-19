import java.util.Comparator;
import java.util.List;

public class eighteen {
    public static void main(String[] args) {
        //Задача 18. Отсортируй список строк по длине (от короткой к длинной).
        List<String> words = List.of("banana", "apple", "fig", "kiwi");
        List<String> result = words.stream().sorted(Comparator.comparing(s->s.length())).toList();
        System.out.println(result);
    }
}
