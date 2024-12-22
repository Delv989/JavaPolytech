public class Practice1 {
    public static void main(String[] args) {
        // Исходная строка с названиями животных
        String animals = "Cat, Dog, Elephant, Fox, Giraffe";

        // 1. Метод split(): Разделение строки на массив по запятой
        String[] animalArray = animals.split(", ");
        System.out.println("Список животных:");
        for (String animal : animalArray) {
            System.out.println(animal);
        }

        // 2. Метод join(): Объединение массива строк в одну строку
        String joinedAnimals = String.join(" | ", animalArray);
        System.out.println("\nЖивотные через ' | ': " + joinedAnimals);

        // 3. Метод replace(): Замена одного животного на другое
        String replacedAnimals = animals.replace("Fox", "Wolf");
        System.out.println("\nЗамена 'Fox' на 'Wolf': " + replacedAnimals);

        // 4. Метод startsWith(): Проверка, начинается ли строка с определенного слова
        System.out.println("\nНачинается ли строка с 'Cat'? " + animals.startsWith("Cat"));

        // 5. Метод endsWith(): Проверка, заканчивается ли строка на определенное слово
        System.out.println("Заканчивается ли строка на 'Giraffe'? " + animals.endsWith("Giraffe"));

        // 6. Метод toUpperCase(): Преобразование строки в верхний регистр
        System.out.println("\nВ верхнем регистре: " + animals.toUpperCase());

        // 7. Метод toLowerCase(): Преобразование строки в нижний регистр
        System.out.println("В нижнем регистре: " + animals.toLowerCase());

        // 8. Метод contains(): Проверка, содержит ли строка определенное слово
        System.out.println("\nСодержит ли строка 'Dog'? " + animals.contains("Dog"));

        // 9. Метод indexOf(): Поиск индекса первого вхождения подстроки
        System.out.println("Индекс первого вхождения 'Elephant': " + animals.indexOf("Elephant"));

        // 10. Метод substring(): Извлечение части строки
        System.out.println("\nИзвлеченная подстрока (от 10 до конца): " + animals.substring(10));
    }
}