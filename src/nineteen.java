import java.util.List;

public class nineteen {
    public static void main(String[] args) {
        //Задача 19. Переведи список чисел в список строк вида "Число: X".
        List<Integer> numbers = List.of(1, 2, 3);
        List<String>result = numbers.stream().map(n->"Число: "+n).toList();
        System.out.println(result);
    }
}
