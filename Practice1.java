public class Practice1 {
    public static void main(String[] args) {
        //byte, short, int, char
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
        }
        //enum
        enum Color { RED, GREEN, BLUE }
        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("Color is RED");
                break;
            case GREEN:
                System.out.println("Color is GREEN");
                break;
            case BLUE:
                System.out.println("Color is BLUE");
                break;
        }
        //String
        String name = "Alice";
        switch (name) {
            case "Alice":
                System.out.println("Hello Alice");
                break;
            case "Bob":
                System.out.println("Hello Bob");
                break;
            default:
                System.out.println("Hello Stranger");
                break;
        }
        // Byte, Short, Integer, Character
        Integer value1 = 2;
        switch (value1) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
        }

    }
}
