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

        System.out.print("\n" + Messages.VIEW_RESULT);

        for (int i = 0; i < turns; i++) {
            for (Car car : cars) {
                car.move();
            }

            outputView.printTurnResult(cars);
        }

        //find highScore;
    }

}
