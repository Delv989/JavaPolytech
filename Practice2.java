public class Practice2 {
    public static void main(String[] args) {
        //break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Цикл завершён, так как i = " + i);
                break; // Выход из цикла
            }
            System.out.println("i = " + i);
        }
        //continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Пропустить итерацию, если i чётное
            }
            System.out.println("i = " + i);
        }

    }
}
