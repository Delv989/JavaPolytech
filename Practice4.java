public class Practice4 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));             // true
        System.out.println("b1==i1 " + (b1 == i1));             // true
        System.out.println("a1==b1 " + (a1 == b1));             // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));// true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));// true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));// true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));             // true
        System.out.println("b2==i2 " + (b2 == i2));             // true
        System.out.println("a2==b2 " + (a2 == b2));             // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));// true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));// true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));// true

    }
}
//Объяснение:
//Для i1 = 128 (значение вне диапазона IntegerCache):
//  a1 и b1 создаются как разные экземпляры класса Integer, так как значение 128 не кэшируется.
//  a1 == b1 возвращает false, так как сравниваются ссылки на разные объекты.
//  a1.equals(b1) возвращает true, так как значения совпадают.
//Для i2 = 127 (значение в диапазоне IntegerCache):
//  a2 и b2 ссылаются на один и тот же объект, кэшируемый IntegerCache.
//  a2 == b2 возвращает true, так как это одна и та же ссылка.
//  a2.equals(b2) также возвращает true, так как значения совпадают.
// Для чего используется класс IntegerCache?
//      IntegerCache — это внутренний кэш класса Integer, хранящий объекты для значений от -128 до 127. Этот механизм
//      позволяет оптимизировать память и ускорить выполнение программы при работе с часто используемыми значениями.
//      Если число попадает в диапазон кэша, метод valueOf возвращает существующий объект, а не создает новый.
//      Это объясняет поведение сравнения ссылок для значений 127 и 128.

