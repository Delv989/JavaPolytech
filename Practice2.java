// Внутренний класс имеет доступ к полям и методам внешнего класса,
// даже если они имеют модификатор доступа private.

public class Practice2 {
    private String outerField = "Outer field";

    public class Inner {
        void accessOuterField() {
            // Внутренний класс имеет доступ к private полю внешнего класса
            System.out.println(outerField);
        }
    }

    public void createInner() {
        Inner inner = new Inner();
        inner.accessOuterField();
    }

}