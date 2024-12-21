// Класс с модификатором final
final class FinalClass {
    public void display() {
        System.out.println("Display from FinalClass");
    }
}

// Попытка наследования от final-класса приведет к ошибке компиляции
// practice2.java:9: error: cannot inherit from final FinalClass
class Subclass extends FinalClass {  // Ошибка компиляции!
    public void display() {
        System.out.println("Display from Subclass");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();  // Вызов метода display
    }
}