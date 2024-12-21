// Ключевое слово super применяется для:

// 1. Обращения к конструктору суперкласса
// 2. Доступу к полю суперкласса
// 3. Доступу к методу суперкласса

// Выдержка из теории.

// Суперкласс
class Animal {
    String name;

    // Конструктор суперкласса
    public Animal(String name) {
        this.name = name;
    }

    // Метод суперкласса
    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

// Подкласс
class Dog extends Animal {

    // Конструктор подкласса, использующий конструктор суперкласса
    public Dog(String name) {
        // Вызов конструктора суперкласса(пример 1 варианта использования)
        super(name);
    }

    // Метод, переопределяющий метод суперкласса
    @Override
    public void speak() {
        // Вызов метода суперкласса(пример 3 варианта использования)
        super.speak();
        System.out.println(name + " barks");
    }

    // Метод для доступа к полю суперкласса
    public void showName() {
        // Доступ к полю суперкласса(пример 2 варианта использования)
        System.out.println("The dog's name is: " + super.name);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");

        dog.showName();
        dog.speak();
    }
}