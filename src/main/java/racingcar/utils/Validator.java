package racingcar.utils;

public class Validator {
    public static void validateCarNames(String name) {
        if (5 < name.length()) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_TOO_LONG);
        }
    }

    public static void validateIsEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_EMPTY);
        }
    }

    public static void validateTurns(String input) {
        if (!input.startsWith("\\d+") || input.startsWith("0")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_DIGIT);
        }
    }
}
