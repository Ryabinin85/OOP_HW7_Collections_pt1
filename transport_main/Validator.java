package transport_main;

public class Validator {
    public static String validateString(String stringValidation) {
        return stringValidation == null
                || stringValidation.isEmpty()
                || stringValidation.isBlank() ? "default" : stringValidation;
    }
    public static Boolean validateBoolean (Boolean value) {
        return value != null && value;
    }
    public static Integer validateInteger (Integer value) {
        if (value != 0) value = Math.abs(value);
        else value = 1;
        return value;
    }
}