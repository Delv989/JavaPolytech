package anotherpackage;

import mypackage.Example;

public class AnotherPackage {
    public static void main(String[] args) {
        Example example = new Example();

        // Доступ к public полю и методу
        System.out.println(example.publicField);
        example.publicMethod();

        // Нет доступа к protected, default и private полям и методам
        // System.out.println(example.protectedField); // Ошибка компиляции
        // example.protectedMethod(); // Ошибка компиляции
        // System.out.println(example.defaultField); // Ошибка компиляции
        // example.defaultMethod(); // Ошибка компиляции
        // System.out.println(example.privateField); // Ошибка компиляции
        // example.privateMethod(); // Ошибка компиляции

        // Доступ к private через публичный метод
        example.accessPrivate();
    }
}
