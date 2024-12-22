import java.util.StringJoiner;

// Класс StringJoiner позволяет удобно объединять строки
// с использованием разделителей, префиксов и суффиксов.

public class Practice2 {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем, префиксом и суффиксом
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Итоговая строка: [Apple, Banana, Cherry]
        System.out.println("Объединенная строка: " + joiner);

        // Пример объединения двух StringJoiner
        StringJoiner otherJoiner = new StringJoiner("; ");
        otherJoiner.add("Date");
        otherJoiner.add("Elderberry");

        joiner.merge(otherJoiner);
        System.out.println("После объединения: " + joiner); // [Apple, Banana, Cherry, Date; Elderberry]
    }
}