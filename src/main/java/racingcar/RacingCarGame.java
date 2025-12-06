package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGame {

    public static List<RacingCar> cars;
    public RacingCar racingCar;

    public RacingCarGame() {
        cars = new ArrayList<>();
    }

    public void start() {
        OutputView.askCarNames();
        InputView.readInput();
        OutputView.askTurnCounts();
        InputView.readTurnCounts();
        generateCars();
        totalMove();

    }

    public static String[] splitCarNames(String input) {
        return input.split("[,]");
    }

    public void generateCars() {
        String input = InputView.readInput();
        String[] carNames = splitCarNames(input);
        for (String val : carNames) {
            RacingCar racingCar = new RacingCar(val);
            cars.add(racingCar);
        }
    }

    public void moveAll() {
        for (RacingCar car : cars) {
            car.go();
        }
        OutputView.printCurrentStatus(cars);
    }

    public void totalMove() {
        int counts = InputView.readTurnCounts();
        for (int i = 0; i < counts; i++) {
            moveAll();
            System.out.println("\n");
        }
    }

    public void selectChampion() {

    }

}
