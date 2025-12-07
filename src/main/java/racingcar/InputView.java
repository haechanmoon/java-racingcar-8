package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readInput() {
        return Console.readLine();
    }

    public static int readTurnCounts() {
        String input = Console.readLine();
        Validator.validateEmpty(input);
        Validator.validateNumber(input);
        return Integer.parseInt(input);
    }
}
