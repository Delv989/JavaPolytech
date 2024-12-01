import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 2};

        // 1. Преобразование массива в строку
        System.out.println("toString: " + Arrays.toString(arr)); // [5, 1, 4, 3, 2]

        // 2. Сортировка массива
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        // 3. Бинарный поиск
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index); // 2

        // 4. Сравнение массивов (equals)
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Arrays are equal: " + Arrays.equals(arr, arr2)); // true

        // 5. Сравнение массивов (compare)
        int[] arr3 = {1, 2, 3, 4, 6};
        System.out.println("Comparison result: " + Arrays.compare(arr, arr3)); // -1 (arr меньше arr3)
    }
}
