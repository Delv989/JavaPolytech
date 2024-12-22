public class Practice1 {

    // Пример 1: private
    public class PrivateInner {
        void printMessage() {
            System.out.println("Private inner class");
        }
    }

    public void createPrivateInner() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.printMessage();
    }

    // Пример 2: Default (пакетный доступ)
    class DefaultInner {
        void printMessage() {
            System.out.println("Default inner class");
        }
    }

    // Пример 3: protected
    protected class ProtectedInner {
        void printMessage() {
            System.out.println("Protected inner class");
        }
    }

    // Пример 4: public
    public class PublicInner {
        void printMessage() {
            System.out.println("Public inner class");
        }
    }
}