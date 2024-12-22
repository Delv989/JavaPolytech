// Внешний класс не имеет доступа к private полям или методам
// внутреннего класса, если только внутренний класс не
// предоставляет явный доступ через публичные методы.

public class Practice3 {
    private String outerField = "Outer field";

    public class Inner {
        private String innerField = "Inner field";

        public void innerMethod() {
            System.out.println(innerField);
        }
    }

    public void outerMethod() {
        Inner inner = new Inner();
        // Внешний класс может получить доступ к методам внутреннего класса, если они public
        inner.innerMethod();
        // Внешний класс не может напрямую обращаться к private полям внутреннего класса
        // System.out.println(inner.innerField); // Ошибка
    }
}