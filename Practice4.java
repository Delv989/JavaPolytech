import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Интерфейс Practice4 предоставляет механизм автоматического
// закрытия ресурсов, таких как потоки или соединения с базой данных,
// после их использования. Классы, реализующие Practice4, могут
// использоваться в блоке try-with-resources, который автоматически
// закрывает ресурсы после завершения работы с ними,
// даже если произошла ошибка.

public class Practice4 {
    public static void main(String[] args) {
        // Пример использования try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}