import java.util.List;

public class Practice8 {
    public static void main(String[] args) {
        // Использование var для локальных переменных
        var number = 10; // Компилятор выводит тип как int
        var text = "Hello, World!"; // Компилятор выводит тип как String
        var list = List.of(1, 2, 3, 4); // Компилятор выводит тип как List<Integer>

        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        System.out.println("List: " + list);

        // Использование var в цикле
        for (var element : list) {
            System.out.println("Element: " + element);
        }
    }
}
