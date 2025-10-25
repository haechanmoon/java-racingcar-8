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

        // 3. (다음 단계) 받아온 이름들로 'Car' 객체들을 만든다.
        List<Car> cars = new ArrayList<>();

        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }
}
