package racingcar.utils;

public class Validator {
    public static void validateCarNames(String name) {
        if (5 < name.length()) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_TOO_LONG);
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_IS_BLANK);
        }
    }

    public static void validateIsEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_EMPTY);
        }
    }

    public static void validateTurns(String input) {
        if (!input.matches("\\d+") || input.startsWith("0")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
