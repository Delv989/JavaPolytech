public class Practice2 {

    public static void main(String[] args) {
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleIllegalArgumentException();
        handleClassCastException();
        handleNullPointerException();
    }

    // Пример 1: ArithmeticException
    public static void handleArithmeticException() {
        try {
            int totalMarks = 450;
            int numberOfSubjects = 0; // Ошибка: деление на 0
            int average = totalMarks / numberOfSubjects;
            System.out.println("Средний балл: " + average);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль невозможно!");
        }
    }

    // Пример 2: ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] scores = {90, 85, 88}; // Массив с результатами
            System.out.println("Результат четвертого экзамена: " + scores[3]); // Ошибка
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: попытка доступа к элементу за пределами массива!");
        }
    }

    // Пример 3: IllegalArgumentException
    public static void handleIllegalArgumentException() {
        try {
            setTemperature(-500); // Недопустимая температура
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void setTemperature(int temperature) {
        if (temperature < -273) { // Абсолютный ноль
            throw new IllegalArgumentException("Температура не может быть ниже -273°C!");
        }
        System.out.println("Температура установлена: " + temperature + "°C");
    }

    // Пример 4: ClassCastException
    public static void handleClassCastException() {
        try {
            Object value = "123"; // Строка
            Integer number = (Integer) value; // Неверное приведение типов
            System.out.println("Число: " + number);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: невозможно привести строку к числу!");
        }
    }

    // Пример 5: NullPointerException
    public static void handleNullPointerException() {
        try {
            String name = null; // Объект равен null
            System.out.println("Длина имени: " + name.length()); // Попытка вызова метода
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: попытка вызова метода у null объекта!");
        }
    }
}