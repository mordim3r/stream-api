import java.util.List;

public class seven {
    //Подсчитай сумму всех чисел в списке.
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        int sum = numbers.stream().mapToInt(n->n).sum();//
        System.out.println(sum);
    }




}
