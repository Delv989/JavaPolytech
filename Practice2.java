import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Practice2 {
    public static void main(String[] args) {
        // Создание потока вывода ByteArrayOutputStream
        OutputStream outputStream = new ByteArrayOutputStream();

        try {
            // Запись данных в поток по одному байту
            String data = "Hello, OutputStream!";
            for (int i = 0; i < data.length(); i++) {
                outputStream.write(data.charAt(i));  // Записываем символ как байт
            }

            // Вывод содержимого потока
            System.out.println(outputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();  // Закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}