package racingcar.views;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

public class InputView {
    public static String getCarNames() {
        String input = Console.readLine();
        Validator.validateIsEmpty(input);
        Validator.validateCarNames(input);
        return input;
    }

    public static int getTurns() {
        String input = Console.readLine();
        Validator.validateIsEmpty(input);
        Validator.validateTurns(input);
        return Integer.parseInt(input);
    }
}
