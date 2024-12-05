public class Practice1 {
    // Метод для вывода целых чисел
    public void display(Integer... numbers) {
        System.out.println("Целые числа:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Метод для вывода строк
    public void display(String... strings) {
        System.out.println("Строки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Метод для вывода смешанных объектов
    public void display(Object... objects) {
        System.out.println("Объекты:");
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    // Перегруженный метод без переменных параметров
    public void display() {
        System.out.println("Никаких параметров.");
    }

    public static void main(String[] args) {
        Practice1 example = new Practice1();

        // Вызов метода для чисел
        example.display(1, 2, 3, 4);

        // Вызов метода для строк
        example.display("Привет", "Мир");

        // Вызов метода для смешанных объектов
        example.display(42, "Java", 3.14, true);

        // Вызов метода без параметров
        example.display();
    }
}
