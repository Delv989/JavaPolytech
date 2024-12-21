// Калькулятор может складывать разное количество чисел и разных типов
// Безусловно, такой функционал можно и нужно реализовывать иначе,
// но как учебный пример подойдет.
class Calculator {

    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));        // Вызов метода с двумя целыми числами
        System.out.println(calc.add(1, 2, 3));     // Вызов метода с тремя целыми числами
        System.out.println(calc.add(1.5, 2.5));    // Вызов метода с двумя числами с плавающей точкой
    }
}