import java.util.List;

public class fourteen {
    public static void main(String[] args) {
       // Подсчитай, сколько строк в списке начинаются на "S".
        List<String> words = List.of("Stream", "Spring", "Java", "Set", "Map");
        long count = words.stream().filter(s->s.startsWith("S")).count();
        System.out.println(count);


    }

}
