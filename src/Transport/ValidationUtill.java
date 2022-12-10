package Transport;

public class ValidationUtill {

    public static String validateString(String value) {
        if (value != null && !value.isBlank() && !value.isEmpty()) {
            return value;
        } else {
            return "default";
        }
    }

    public static double validateNum(double value) {
        return Math.max(value, 1.5);
    }
}