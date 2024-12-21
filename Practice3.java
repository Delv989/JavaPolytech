// Нужно вызывать во всех конструкторах предварительно конструктор
// с тремя параметрами.
class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0);  // Вызов конструктора с тремя параметрами
        z = 1;
    }

    public A(int a) {
        this(a, 0, 0);  // Вызов конструктора с тремя параметрами
        z = 1;
    }

    public A(int a, int b) {
        this(a, b, 0);  // Вызов конструктора с тремя параметрами
        z = 1;
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        A obj1 = new A();        // Все поля по умолчанию: a=0, b=0, c=0, z=1
        A obj2 = new A(5);       // a=5, b=0, c=0, z=1
        A obj3 = new A(5, 10);   // a=5, b=10, c=0, z=1
        A obj4 = new A(5, 10, 15); // a=5, b=10, c=15, z=1

        obj1.printValues();  // Ожидается: a=0, b=0, c=0, z=1
        obj2.printValues();  // Ожидается: a=5, b=0, c=0, z=1
        obj3.printValues();  // Ожидается: a=5, b=10, c=0, z=1
        obj4.printValues();  // Ожидается: a=5, b=10, c=15, z=1
    }
}