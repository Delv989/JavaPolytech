interface Calculator {

    // Вложенный класс в интерфейсе для выполнения математических операций
    static class Operations {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль невозможно!");
            }
            return a / b;
        }
    }

    // Пример метода в интерфейсе
    void printMessage();
}

public class CalculatorApp implements Calculator {

    @Override
    public void printMessage() {
        System.out.println("Калькулятор готов к вычислениям!");
    }

    public static void main(String[] args) {
        // Создание экземпляра вложенного класса через интерфейс
        Calculator.Operations operations = new Calculator.Operations();

        // Использование методов вложенного класса
        int sum = operations.add(10, 5);
        int difference = operations.subtract(10, 5);
        int product = operations.multiply(10, 5);
        int quotient = operations.divide(10, 5);

        // Вывод результатов
        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);

        // Вызов метода внешнего интерфейса
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.printMessage();
    }
}