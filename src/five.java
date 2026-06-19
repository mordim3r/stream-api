import java.util.List;

public class five {
    public static void main(String[] args) {
        //Задача 5. Оставь строки длиннее 3 символов и переведи их в верхний регистр.
        //

        List<String> words = List.of("hi", "java", "go", "stream", "api");
        List <String> result = words.stream()
                .filter(s->s.length()>3)
                .map(s->s.toUpperCase())
                .toList();
        System.out.println(result);

    }
}
