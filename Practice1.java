class AnimalNotFoundException extends Exception {

    // Конструктор без параметров
    public AnimalNotFoundException() {
        super("Животное не найдено!");
    }

    // Конструктор с сообщением
    public AnimalNotFoundException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public AnimalNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class AnimalShelter {

    private Animal[] animals = {
            new Animal("Кот"),
            new Animal("Собака"),
            new Animal("Попугай")
    };

    // Метод для поиска животного в приюте
    public Animal findAnimal(String name) throws AnimalNotFoundException {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;  // Если нашли животное, возвращаем его
            }
        }
        // Если не нашли, выбрасываем исключение
        throw new AnimalNotFoundException("Животное с именем '" + name + "' не найдено в приюте.");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        try {
            // Попытка найти животное
            Animal foundAnimal = shelter.findAnimal("Кошка");
            System.out.println("Животное найдено: " + foundAnimal.getName());
        } catch (AnimalNotFoundException e) {
            // Обработка исключения, если животное не найдено
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}