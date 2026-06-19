import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class two {
    public static void main(String[] args) {
        //Задача 2. Есть список строк. Верни новый список, где все строки в верхнем регистре.
//        List<String> words = List.of("java", "stream", "api");
//// → ["JAVA", "STREAM", "API"]

        List<String> words = List.of("java", "stream", "api");
        List <String > result = words.stream()
                .map(s-> s
                        .toUpperCase()).toList();
        System.out.println(result);


    }
}
