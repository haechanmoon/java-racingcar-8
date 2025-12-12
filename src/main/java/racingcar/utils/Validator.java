package racingcar.utils;

public class Validator {
    public static void validateCarNames(String input) {

    }

    public static void validateIsEmpty(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(Messages.ERROR_IS_EMPTY);
        }
    }
}
