public class Practice5 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 100;
        double d = 5.5;

        // Преобразование byte -> int
        int result1 = b + i; // Результат: int
        System.out.println("b + i = " + result1);

        // Преобразование int -> double
        double result2 = i + d; // Результат: double
        System.out.println("i + d = " + result2);

        // Смешивание типов
        float f = 3.2f;
        double result3 = f + d; // Результат: double
        System.out.println("f + d = " + result3);
    }
}
// Объяснение: Результат операции имеет тип, соответствующий большему операнду.
