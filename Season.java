public enum Season {
    WINTER("Холодное время года"),
    SPRING("Время цветения"),
    SUMMER("Тёплое время года"),
    AUTUMN("Время урожая");

    private final String description;

    // Конструктор перечисления
    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
