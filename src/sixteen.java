import java.util.List;

public class sixteen {
    public static void main(String[] args) {
        //Задача 16. Возьми первые 3 элемента списка и собери их в новый список.
        List<String> words = List.of("один", "два", "три", "четыре", "пять");
        List<String> result = words.stream().limit(3).toList();
        System.out.println(result);

    }
}
