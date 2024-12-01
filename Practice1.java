public class Practice1 {
    public static void main(String[] args) {
        // Логическое условие в while всегда возвращает true, поэтому цикл не завершится.
//        while (true) {
//            System.out.println("Это бесконечный цикл!");
//        }
        // Цикл выполняется один раз, затем условие в while проверяется и снова возвращает true,
        // что делает цикл бесконечным.
        do {
            System.out.println("Это бесконечный цикл!");
        } while (true);
    }
}
