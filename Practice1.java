public class Practice1 {
    public static void main(String[] args) {
        // Демонстрация методов класса StringBuffer
        System.out.println("StringBuffer методы:");
        StringBuffer sb = new StringBuffer("Cat");

        // 1. append(): Добавляет строку в конец
        sb.append(", Dog");
        System.out.println("После append: " + sb); // Cat, Dog

        // 2. insert(): Вставляет строку по указанному индексу
        sb.insert(5, "Elephant, ");
        System.out.println("После insert: " + sb); // Cat, Elephant, Dog

        // 3. replace(): Заменяет часть строки
        sb.replace(5, 14, "Tiger");
        System.out.println("После replace: " + sb); // Cat, Tiger, Dog

        // 4. delete(): Удаляет часть строки
        sb.delete(4, 10);
        System.out.println("После delete: " + sb); // Cat, Dog

        // 5. reverse(): Разворачивает строку
        sb.reverse();
        System.out.println("После reverse: " + sb); // goD ,taC

        // 6. length(): Возвращает длину строки
        System.out.println("Длина строки: " + sb.length()); // 8

        // 7. capacity(): Показывает текущую емкость
        System.out.println("Емкость: " + sb.capacity());

        // 8. ensureCapacity(): Увеличивает емкость
        sb.ensureCapacity(50);
        System.out.println("Емкость после ensureCapacity(50): " + sb.capacity());

        // 9. setLength(): Изменяет длину строки
        sb.setLength(5);
        System.out.println("После setLength(5): " + sb); // goD ,

        // 10. charAt(): Возвращает символ по индексу
        System.out.println("Символ на индексе 3: " + sb.charAt(3)); // ,

        // Демонстрация методов класса StringBuilder
        System.out.println("\nStringBuilder методы:");
        StringBuilder builder = new StringBuilder("Hello");

        // Используем методы аналогично StringBuffer
        builder.append(" World");
        System.out.println("После append: " + builder); // Hello World

        builder.insert(6, "Java ");
        System.out.println("После insert: " + builder); // Hello Java World

        builder.replace(6, 10, "Kotlin");
        System.out.println("После replace: " + builder); // Hello Kotlin World

        builder.reverse();
        System.out.println("После reverse: " + builder); // dlroW niltoK olleH
    }
}