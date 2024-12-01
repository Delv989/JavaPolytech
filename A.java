public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void callPrintVars() {
        printVars(); // Вызов из нестатического метода
    }

    public static void main(String[] args) {
        // Способ 1: Вызов через имя класса
        A.printVars();

        // Способ 2: Вызов через объект
        A obj = new A();
        obj.printVars();

        // Способ 3: Вызов внутри статического метода
        printVars();

        // Способ 4: Вызов внутри нестатического метода
        obj.callPrintVars();
    }
}
