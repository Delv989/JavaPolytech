package mypackage;

public class SamePackage {
    public static void main(String[] args) {
        Example example = new Example();

        // Доступ к public полю и методу
        System.out.println(example.publicField);
        example.publicMethod();

        // Доступ к protected полю и методу (в том же пакете)
        System.out.println(example.protectedField);
        example.protectedMethod();

        // Доступ к полю и методу без спецификатора (default)
        System.out.println(example.defaultField);
        example.defaultMethod();

        // Нет доступа к private полю и методу
        // System.out.println(example.privateField); // Ошибка компиляции
        // example.privateMethod(); // Ошибка компиляции

        // Доступ к private через публичный метод
        example.accessPrivate();
    }
}

