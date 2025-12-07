package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCarGame {

    private static final String delimiter = "[,]";
    public List<RacingCar> cars;

    public RacingCarGame() {
        this.cars = new ArrayList<>();
    }

    public void start() {
        OutputView.askCarNames();
        String input = InputView.readInput();
        OutputView.askTurnCounts();
        int turns = InputView.readTurnCounts();
        generateCars(input);
        OutputView.runResult();
        totalMove(turns);
        OutputView.totalResult(cars);
    }

    public static List<String> splitCarNames(String input) {
        Validator.validateEmpty(input);
        String[] names = input.split(delimiter);
        Validator.validateNames(names);
        return new ArrayList<>(Arrays.asList(names));

    }

    public void generateCars(String input) {
        List<String> carNames = splitCarNames(input);
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

    public void totalMove(int counts) {
        for (int i = 0; i < counts; i++) {
            moveAll();
            System.out.print("\n");
        }
    }

    public static List<String> selectChampion(List<RacingCar> cars) {
        int maxPosition = getMaxPosition(cars);
        List<String> champion = new ArrayList<>();

        for (RacingCar car : cars) {
            if (maxPosition == car.getPosition()) {
                champion.add(car.getName());
            }
        }
        return champion;
    }

    private static int getMaxPosition(List<RacingCar> cars) {
        int maxPosition = 0;
        for (RacingCar car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
