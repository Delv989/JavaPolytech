// Использование final в catch блоке имеет особое значение.
// Это гарантирует, что переменная исключения не будет изменена,
// т.е. она будет неизменной в рамках обработки исключения.

// Пример:

public class FinalExceptionExample {

    public static void main(String[] args) {
        try {
            throw new Exception("Пример исключения");
        } catch (final Exception e) {
            // Попытка изменить исключение вызовет ошибку компиляции
            // e = new Exception("Новая ошибка"); // Ошибка компиляции

            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}