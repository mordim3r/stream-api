import java.util.Comparator;
import java.util.List;

public class eight {
    public static void main(String[] args) {
        //Задача 8. Собери только имена, начинающиеся на "А", отсортируй по алфавиту,
        // верни как List.
        List<String> names = List.of("Антон", "Борис", "Алина", "Виктор", "Андрей");
        List<String> result = names.stream()
                .filter(s->s.startsWith("А"))
                .sorted()
                .toList();
        System.out.println(result);



    }
}
