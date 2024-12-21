// Аннотация @Override помогает компилятору проверить,
// действительно ли метод переопределяет метод родительского класса.
// Если в коде ошибочно написан метод, который не соответствует
// сигнатуре метода в суперклассе, то компилятор сообщит об ошибке.

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    // Ошибка: метод eat() в классе Dog должен иметь такую же сигнатуру, как и в классе Animal
    // Practice3.java:9: error: method does not override or implement a method from a supertype
    @Override
    public void bark() {  // Ошибка, метод должен называться eat()
        System.out.println("Dog is barking");
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();  // Это сработает, но аннотация @Override вызывает ошибку при компиляции
    }
}