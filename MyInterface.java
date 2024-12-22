interface MyInterface {
    // Неабстрактный метод с реализацией по умолчанию
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    // Переопределение default метода (необязательно)
    @Override
    public void defaultMethod() {
        System.out.println("This is the overridden default method.");
    }

    public static void main(String[] args) {
        // Вызов статического метода
        MyInterface.staticMethod(); // Ожидаемый вывод: "This is a static method."

        // Создание объекта класса и вызов метода по умолчанию
        MyClass obj = new MyClass();
        obj.defaultMethod(); // Ожидаемый вывод: "This is the overridden default method."
    }
}