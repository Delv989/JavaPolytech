class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("key", 123);

        // Проверяем, является ли объект экземпляром Pair
        if (pair instanceof Pair<?, ?>) {
            System.out.println("Объект является экземпляром Pair.");
        }

        // Неправильно: попытка проверить конкретные типы приведет к ошибке компиляции
        /*
        if (pair instanceof Pair<String, Integer>) {
            // Ошибка компиляции из-за стирания типов
        }
        */
    }
}
