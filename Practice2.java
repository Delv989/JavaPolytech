public class Practice2 {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;
        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;  // Выполняется, так как value == 2
            case 3:
                i = 3;  // Также выполняется из-за отсутствия break
                break;
        }
        System.out.println(i);
        // Если в конструкции case отсутствует break, происходит "провал" (fall-through).
        // Это означает, что выполнение продолжается в следующем case, независимо от совпадения.
    }
}
