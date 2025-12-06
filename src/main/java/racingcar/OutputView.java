package racingcar;

import java.util.List;

public class OutputView {

    public static void askCarNames() {
        System.out.println(Messages.ASK_CAR_NAMES);
    }

    public static void askTurnCounts() {
        System.out.println(Messages.ASK_TURN_COUNTS);
    }

    public static void runResult() {
        System.out.println(Messages.RUN_RESULT);
    }

    public static void printCurrentStatus(List<RacingCar> cars) {
        for (RacingCar car : cars) {
            System.out.println(car.getName() + ": " + car.invertPosition());
        }
    }


    public static void totalResult() {
        List<String> champion = RacingCarGame.selectChampion();
        System.out.print(Messages.FINAL_CHAMPION);
        for (String val : champion) {
            System.out.print(val + ", ");
        }
    }

}
