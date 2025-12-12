package racingcar.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.views.InputView;
import racingcar.views.OutputView;

public class RacingCarGame {
    private String input;

    public void start() {
        OutputView.requestCarNameMessage();
        input = InputView.getCarNames();
        OutputView.requestTurnMessage();
        int turns = InputView.getTurns();
        OutputView.printRunResultMessage();

    }

    public List<String> getNames() {
        String[] carNames = input.split("[,]");
        return new ArrayList<>(Arrays.asList(carNames));
    }

    public List<RacingCar> generateCars() {
        List<String> names = getNames();
        List<RacingCar> cars = new ArrayList<>();
        for (String name : names) {
            RacingCar car = new RacingCar(name);
            cars.add(car);
        }
        return cars;
    }
}
