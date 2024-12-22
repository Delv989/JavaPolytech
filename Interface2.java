interface Interface2 {
    // Неабстрактный метод с реализацией по умолчанию
    default void hello() {
        System.out.println("Hello from Interface2");
    }
}