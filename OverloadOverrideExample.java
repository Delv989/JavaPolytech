class BaseClass {
    // Метод с перегрузкой
    public void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public void greet(String name, int age) {
        System.out.println("Привет, " + name + "! Тебе " + age + " лет.");
    }
}

class DerivedClass extends BaseClass {
    // Переопределение метода
    @Override
    public void greet(String name) {
        System.out.println("Здравствуй, " + name + "!");
    }
}

public class OverloadOverrideExample {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        DerivedClass derived = new DerivedClass();

        base.greet("Алиса");
        base.greet("Боб", 25);

        derived.greet("Алиса");
        derived.greet("Боб", 30); // Вызов метода перегрузки из суперкласса
    }
}
