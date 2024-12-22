// Практика 3
import java.util.Calendar;
import java.util.Formatter;

public class Practice3 {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Calendar calendar = Calendar.getInstance();

        // Создаем объект Formatter
        Formatter formatter = new Formatter();

        // %tH: Часы в 24-часовом формате
        formatter.format("Часы (24-часовой формат): %tH%n", calendar);

        // %tM: Минуты
        formatter.format("Минуты: %tM%n", calendar);

        // %tS: Секунды
        formatter.format("Секунды: %tS%n", calendar);

        // %tB: Полное название месяца
        formatter.format("Месяц: %tB%n", calendar);

        // %tA: Полное название дня недели
        formatter.format("День недели: %tA%n", calendar);

        // Вывод результата
        System.out.println(formatter);

        // Закрываем Formatter
        formatter.close();
    }
}