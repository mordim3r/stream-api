import java.util.List;

public class tvelwe {
    public static void main(String[] args) {
        //Задача 12. Проверь, что все строки в списке непустые.
        // Результат — boolean.
        //List<String> words = List.of("java", "", "stream");
       // → false

        List<String> words = List.of("java", "", "stream");
        boolean result = words.stream()
                .allMatch(s->!(s.isEmpty()));

        System.out.println(result);
    }
}
