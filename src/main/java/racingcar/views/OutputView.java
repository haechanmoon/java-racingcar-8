package racingcar.views;

import racingcar.utils.Messages;

public class OutputView {
    public static void requestCarNameMessage() {
        System.out.println(Messages.ASK_CAR_NAME);
    }

    public static void requestTurnMessage() {
        System.out.println(Messages.ASK_TURN_COUNT);
    }

    public static void printRunResultMessage() {
        System.out.println(Messages.PRINT_RUN_RESULT_MESSAGE);
    }
}
