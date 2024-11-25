public class Practice4 {
    public static void main(String[] args) {
        String str = "Число: ";
        int number = 42;
        double decimal = 3.14;

        // Конкатенация строки с целым числом и числом с плавающей точкой
        String result = str + number + ", Pi = " + decimal;
        System.out.println(result);

        // Конкатенация с объектом
        Object obj = new Object();
        String objectString = "Объект: " + obj.toString();
        System.out.println(objectString);
    }
}
