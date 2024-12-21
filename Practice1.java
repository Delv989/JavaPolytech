class Superclass {
    // Метод с модификатором final, который нельзя переопределить в подклассе
    public final void showMessage() {
        System.out.println("Message from Superclass");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    // practice1.java:10: error: showMessage() in Subclass cannot override showMessage() in Superclass
    public void showMessage() {  // Ошибка компиляции!
        System.out.println("Message from Subclass");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Superclass obj = new Superclass();
        obj.showMessage();  // Вызов метода showMessage
    }
}