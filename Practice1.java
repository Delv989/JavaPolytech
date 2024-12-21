public class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод equals
    @Override
    public boolean equals(Object obj) {
        // Проверка на сравнение с самим собой
        if (this == obj) return true;

        // Проверка на null и совпадение классов
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приведение типа и сравнение значений полей
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }


    // Геттеры и сеттеры (опционально)
}