public class Practice2_main {
    public static void main(String[] args) {
        practice2 outer = new practice2();
        outer.createInner(); // Внутренний класс имеет доступ к private полям
    }
}