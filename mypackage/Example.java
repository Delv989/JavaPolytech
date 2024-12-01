// Класс в одном пакете
package mypackage;

public class Example {
    // Поля с разными уровнями доступа
    public String publicField = "Доступен всем";
    protected String protectedField = "Доступен в пакете и подклассам";
    String defaultField = "Доступен только в пакете";
    private String privateField = "Доступен только в этом классе";

    // Методы для демонстрации доступа
    public void publicMethod() {
        System.out.println("Это public метод: доступен всем");
    }

    protected void protectedMethod() {
        System.out.println("Это protected метод: доступен в пакете и подклассам");
    }

    void defaultMethod() {
        System.out.println("Это метод без спецификатора: доступен только в пакете");
    }

    private void privateMethod() {
        System.out.println("Это private метод: доступен только в этом классе");
    }

    // Метод внутри класса для демонстрации private доступа
    public void accessPrivate() {
        System.out.println("Доступ к private полю: " + privateField);
        privateMethod();
    }
}
