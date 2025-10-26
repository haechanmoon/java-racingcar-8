package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final InputView inputView;
    private final OutputView outputView;

    public RacingGame() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        List<String> carNames = inputView.getCarNames();
        int turns = inputView.getTurns();
        List<Car> cars = new ArrayList<>();

        for (String name : carNames) {
            cars.add(new Car(name));
        }
        System.out.println("\n" + Messages.EXECUTION_RESULT);

        for (int i = 0; i < turns; i++) {
            for (Car car : cars) {
                car.move();
            }
            outputView.printTurnResult(cars);
        }
        outputView.printWinners(selectWinners(cars));
    }

    private List<String> selectWinners(List<Car> cars) {

        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }

        List<String> winnerNames = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winnerNames.add(car.getName());
            }
        }

        return winnerNames;
    }
}
