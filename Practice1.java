import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // Путь к файлу, который будем читать
        String fileName = "example.txt";

        // Создание объекта File, который ссылается на наш файл
        File file = new File(fileName);

        // Используем Scanner для чтения данных из файла
        try (Scanner scanner = new Scanner(file)) {
            // Чтение и вывод каждой строки из файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Читаем одну строку
                System.out.println(line); // Выводим строку
            }
        } catch (FileNotFoundException e) {
            // Обработка исключения, если файл не найден
            System.out.println("File not found: " + fileName);
        }
    }
}