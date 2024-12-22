import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    // Пример использования @Override
    class Animal {
        public void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    // Пример использования @Deprecated
    class MyClass {
        @Deprecated
        public void oldMethod() {
            System.out.println("This method is outdated");
        }

        public void newMethod() {
            System.out.println("This is the recommended method");
        }
    }

    // Пример использования @SuppressWarnings
    @SuppressWarnings("unchecked")
    public void suppressWarningExample() {
        List rawList = new ArrayList();
        rawList.add("Hello");
        String str = (String) rawList.get(0); // Подавляется предупреждение о приведении типов
        System.out.println(str);
    }

    public static void main(String[] args) {
        practice1 example = new practice1();

        // Пример @Override
        Dog dog = example.new Dog();
        dog.makeSound(); // Ожидаемый вывод: "Bark"

        // Пример @Deprecated
        MyClass myClass = example.new MyClass();
        myClass.oldMethod(); // Ожидаемый вывод: "This method is outdated" (с предупреждением компилятора)

        // Пример @SuppressWarnings
        example.suppressWarningExample(); // Ожидаемый вывод: "Hello"
    }
}