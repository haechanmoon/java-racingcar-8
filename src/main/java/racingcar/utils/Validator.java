package racingcar.utils;

public class Validator {
    private static final int STANDARD_NUMBER_LENGTH = 5;

    public static void validateCarNames(String name) {
        if (STANDARD_NUMBER_LENGTH < name.length()) {
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
