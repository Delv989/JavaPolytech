public class Practice2 {
    public static void main(String[] args) {
        // 1. Проверка объекта на принадлежность к классу
        String greeting = "Hello, World!";
        boolean isString = greeting instanceof String;
        System.out.println("Is 'greeting' an instance of String: " + isString);

        // 2. Проверка объекта на принадлежность к родительскому классу
        class Vehicle {}
        class Car extends Vehicle {}
        Car myCar = new Car();
        boolean isVehicle = myCar instanceof Vehicle;
        System.out.println("Is 'myCar' an instance of Vehicle: " + isVehicle);

        // 3. Проверка объекта на принадлежность к собственному классу
        boolean isCar = myCar instanceof Car;
        System.out.println("Is 'myCar' an instance of Car: " + isCar);

        // 4. Проверка null-объекта
        String nullObject = null;
        boolean isNullInstance = nullObject instanceof String;
        System.out.println("Is 'nullObject' an instance of String: " + isNullInstance);

    }
}
