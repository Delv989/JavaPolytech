public class Practice6 {
    public static void main(String[] args) {
        int i = 150;
        byte b = (byte) i; // Сужение, может быть потеря данных
        System.out.println("i = " + i + ", b = " + b); // Вывод: i = 150, b = -106

        double d = 3.14;
        int intValue = (int) d; // Отбрасывается дробная часть
        System.out.println("d = " + d + ", intValue = " + intValue); // Вывод: d = 3.14, intValue = 3
    }
}
