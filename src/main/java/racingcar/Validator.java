package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validator {
    public static final int NUMBER_LINE = 5;

    public static void validateEmpty(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(Messages.ERROR_EMPTY);
        }
    }

    public static void validateNameLength(String name) {
        if (name.length() > NUMBER_LINE) {
            throw new IllegalArgumentException(Messages.ERROR_OVER_NAME);
        }
    }

    public static void validateNameOverFive(String[] names) {
        for (String val : names) {
            validateNameEmpty(val);
            validateNameLength(val);
        }
    }

    public static void validateDuplicateName(String[] names) {
        Set<String> uniqueNames = new HashSet<>(Arrays.asList(names));
        if (uniqueNames.size() != names.length) {
            throw new IllegalArgumentException(Messages.ERROR_NAME_DUPLICATE);
        }
    }

    public static void validateNames(String[] names) {
        validateNameOverFive(names);
        validateDuplicateName(names);
    }

    public static void validateNumber(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException(Messages.ERROR_IS_NOT_NUMBER);
        }
    }

    public static void validateNameEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(Messages.ERROR_CAR_NAME_EMPTY);
        }
    }
}
