package Transport;

public class ValidationUtill {

    public static String validateString(String value) {
        if (value != null && !value.isBlank() && !value.isEmpty()) {
            return value;
        } else {
            return "default";
        }
    }

    public static double validatePower(double value) {
        return Math.max(value, 1.5);
    }

    public static int validateNum(int value) {
        if (value < 0) {
            value = 0;
        } else {
            value = value;
        }
        return value;
    }
}