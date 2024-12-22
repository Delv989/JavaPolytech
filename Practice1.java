import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Practice1 {
    public static void main(String[] args) {
        // Пример строки, которую мы будем читать
        String data = "Hello, InputStream!";

        // Создание потока ввода ByteArrayInputStream
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());

        try {
            // Чтение данных из потока по одному байту
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                // Выводим символ, преобразованный из байта
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();  // Закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}