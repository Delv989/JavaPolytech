public class Practice1 {

    public static void main(String[] args) {
        try {
            // Генерация первого исключения, которое будет перехвачено
            int result = divide(10, 0); // Деление на ноль
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException обработано: " + e.getMessage());
        }

        // Генерация второго исключения, которое не будет перехвачено
        String name = null;
        System.out.println("Длина имени: " + name.length()); // NullPointerException, не обработано
    }

    // Метод для выполнения деления
    public static int divide(int a, int b) {
        return a / b; // Здесь возникает ArithmeticException
    }
}