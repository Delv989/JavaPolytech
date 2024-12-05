import java.util.List;
import java.util.ArrayList;

public class Practice2 {

    //Для чего используется <? extends T>:
    //
    //Чтобы гарантировать, что объекты в коллекции принадлежат к определённому классу или его подклассам.
    //Полезно при чтении данных из коллекции, но запрещает добавление (кроме null), так как компилятор не знает точного подтипа.

    //Для чего используется <? super T>:
    //
    //Чтобы гарантировать, что можно безопасно добавлять объекты типа T или его подклассов.
    //Полезно при записи в коллекцию, но ограничивает чтение, так как возвращаемый объект будет типизирован как Object.

    public static void printItems(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void addItems(List<? super Integer> list) {
        list.add(1);  // Можно добавить Integer
        list.add(2);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        printItems(integers); // Работает, так как Integer extends Number

        List<Number> numbers = new ArrayList<>();
        addItems(numbers); // Работает, так как Number является суперклассом Integer

        List<Object> objects = new ArrayList<>();
        addItems(objects); // Работает, так как Object является суперклассом Integer
    }
}

