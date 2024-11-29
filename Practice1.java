public class Practice1 {
    public static void main(String[] args) {
        Integer value1 = Integer.decode("42");     // Десятичное число
        Integer value2 = Integer.decode("0x2A");   // Шестнадцатеричное число
        Integer value3 = Integer.decode("052");    // Восьмеричное число
        System.out.println(value1); // 42
        System.out.println(value2); // 42
        System.out.println(value3); // 42
    }
}
