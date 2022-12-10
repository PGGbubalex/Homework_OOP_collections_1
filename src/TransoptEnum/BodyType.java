package TransoptEnum;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyCarTitle;

    BodyType(String bodyCarTitle) {
        this.bodyCarTitle = bodyCarTitle;
    }

    public String getBodyCarTitle() {
        return bodyCarTitle;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyCarTitle;
    }
}
