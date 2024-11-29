//Исключение NullPointerException возникает, если значение null
// распаковывается в примитивный тип.
//Объяснение: автоупаковка и автораспаковка работают только с непустыми значениями.
// Попытка получить примитивное значение из null вызывает ошибку.

public class Practice3 {
    public static void main(String[] args) {
        Integer obj = null;
        int value = obj; // Бросается NullPointerException

    }
}
