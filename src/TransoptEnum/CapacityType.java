package TransoptEnum;

public enum CapacityType {
    ESPECIALLY_SMALL(null, 10),
    SMALL(10, 25),
    MEDIUM(25, 50),
    LARGE(50, 80),
    EXTRA_LARGE(80, 120);

    private final Integer lowerBound;
    private final Integer upperBound;

    CapacityType(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Вместимость: ");
        if (lowerBound != null) {
            str.append(" от ").append(lowerBound);
        }
        if (upperBound != null) {
            str.append(" до ").append(upperBound);
        }
        str.append(" мест");
        return str.toString();
    }
}
