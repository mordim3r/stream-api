import java.util.List;

public class nine {
    public static void main(String[] args) {
     //   Задача 9. Собери все числа в один плоский список, оставь только уникальные.
//        javaList<List<Integer>> groups = List.of(
//                List.of(1, 2, 3),
//                List.of(2, 3, 4),
//                List.of(3, 4, 5)
//        );
//// → [1, 2, 3, 4, 5]
//
//[!tip] Подсказка
//
//        Здесь список списков — чтобы "развернуть" его в плоский поток нужен flatMap. А чтобы убрать дубликаты — distinct.
//
//
        List<List<Integer>> groups = List.of(
                List.of(1, 2, 3),
                List.of(2, 3, 4),
                List.of(3, 4, 5)
        );

List <Integer> result = groups.stream()
        .flatMap(list->list.stream())
        .distinct()
        .toList();
        System.out.println(result);



    }
}
