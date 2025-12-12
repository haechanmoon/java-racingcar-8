package racingcar.views;

import java.util.List;
import racingcar.controller.RacingCarGame;
import racingcar.domain.RacingCar;
import racingcar.utils.Messages;

public class OutputView {
    private static RacingCarGame RacingGame;

    public static void requestCarNameMessage() {
        System.out.println(Messages.ASK_CAR_NAME);
    }

    public static void requestTurnMessage() {
        System.out.println(Messages.ASK_TURN_COUNT);
    }

    public static void printRunResultMessage() {
        System.out.println(Messages.PRINT_RUN_RESULT_MESSAGE);
    }

    public static void printTotalStatus() {
        System.out.println(RacingCarGame.sb);
    }


    public static void printWinners(int turns, List<RacingCar> cars) {
        System.out.println(RacingGame.getWinner(turns, cars));
    }
}
