import java.util.Formatter;

public class Practice1 {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        // Пример форматирования
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 123;
        double doubleValue = 45.678;
        String stringValue = "Hello";

        // %b: Логическое значение
        formatter.format("Логическое значение: %b%n", boolValue);

        // %c: Символ
        formatter.format("Символ: %c%n", charValue);

        // %d: Целое число
        formatter.format("Целое число: %d%n", intValue);

        // %f: Число с плавающей точкой
        formatter.format("Число с плавающей точкой: %.2f%n", doubleValue);

        // %s: Строка
        formatter.format("Строка: %s%n", stringValue);

        System.out.println(formatter);

        formatter.close();
    }
}