package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

    public static void validateCarNames(List<String> names) {
        Set<String> onlyOneName = new HashSet<>();
        for (String name : names) {
            name = name.trim();
            if (name.length() > 5) {
                throw new IllegalArgumentException(Messages.ERROR_NAME_LENGTH);
            }
            if (name.isEmpty()) {
                throw new IllegalArgumentException(Messages.ERROR_NAME_EMPTY);
            }
            if (!onlyOneName.add(name)) {
                throw new IllegalArgumentException(Messages.ERROR_NAME_DUPLICATE);
            }
        }
    }

    public static int validateTurns(String input) {
        int turns;
        try {
            turns = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Messages.ERROR_TURNS_NOT_A_NUMBER);
        }
        if (turns <= 0) {
            throw new IllegalArgumentException(Messages.ERROR_TURNS_POSITIVE_INTEGER);
        }
        return turns;
    }

}
