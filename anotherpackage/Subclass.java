package anotherpackage;

import mypackage.Example;

public class Subclass extends Example {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();

        // Доступ к public полю и методу
        System.out.println(subclass.publicField);
        subclass.publicMethod();

        // Доступ к protected полю и методу (через наследование)
        System.out.println(subclass.protectedField);
        subclass.protectedMethod();

        // Нет доступа к default и private полям и методам
        // System.out.println(subclass.defaultField); // Ошибка компиляции
        // subclass.defaultMethod(); // Ошибка компиляции
        // System.out.println(subclass.privateField); // Ошибка компиляции
        // subclass.privateMethod(); // Ошибка компиляции
    }
}
