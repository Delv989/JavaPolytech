//Практика #1: Примеры использования различных спецификаторов
// доступа для внутренних классов.

//private: Внутренний класс доступен только внутри внешнего класса.
//default: Пакетный доступ — доступен только внутри того же пакета.
//protected: Внутренний класс доступен внутри пакета и в подклассах.
//public: Внутренний класс доступен из любого места.
public class Practice1_main {
    public static void main(String[] args) {
        practice1 outer = new practice1();

        // Доступ к protected и public внутренним классам
        practice1.PublicInner publicInner = outer.new PublicInner();
        publicInner.printMessage();

        practice1.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.printMessage();

        // Пример использования DefaultInner доступен внутри того же пакета
        practice1.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.printMessage();
    }
}