package TransoptEnum;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float lowerBound;
    private final Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        String str = "";
        if (lowerBound == null) {
            str += "Грузоподъемность до " + upperBound + " тонн";
        } else if (upperBound == null) {
            str += "Грузоподъемность свыше " + lowerBound + " тонн";
        } else {
            str += "Грузоподъемность: от " + lowerBound + " до " + upperBound;
        }
        return str;
    }
}
