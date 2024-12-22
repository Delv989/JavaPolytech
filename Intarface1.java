interface Interface1 {
    // Неабстрактный метод с реализацией по умолчанию
    default void hello() {
        System.out.println("Hello from Interface1");
    }
}