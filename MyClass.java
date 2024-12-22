class MyClass implements Interface1, Interface2 {
    // Переопределение метода hello() для разрешения конфликта
    @Override
    public void hello() {
        System.out.println("Hello from MyClass");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.hello(); // Ожидаемый вывод: "Hello from MyClass"
    }
}