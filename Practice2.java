// Классический пример для класса Животных с конкретным типом животного

class Animal {
    // Метод для издачи звука
    public void makeSound() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    // Переопределение метода makeSound в классе Dog
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Если у переопределенного и переопределяемого метода не совпадает
// тип возвращаемого значения, это приведет к ошибке компиляции,
// поскольку Java строго проверяет типы в момент компиляции.

//class Super {
// Метод, возвращающий строку
//   public String make() {
//       return "MAKE";
//   }
//}

//class Sub extends Super {
// Ошибка: метод должен возвращать String, а возвращается int
// Practice2.java:32: error: make() in Sub cannot override make() in Super
//    @Override
//    public int make() {
//        return 1;  // Ошибка компиляции
//    }
//}

public class Practice2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  // Выводит: ...

        Dog dog = new Dog();
        dog.makeSound();     // Выводит: Bark
    }
}