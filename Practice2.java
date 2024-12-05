public class Practice2 {
    public static void main(String[] args) {
        double a = 10, b = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op.name() + ": " + op.apply(a, b));
        }
    }
}