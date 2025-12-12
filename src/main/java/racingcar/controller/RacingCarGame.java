package racingcar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.utils.Validator;
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
        List<RacingCar> cars = generateCars();
        OutputView.printTotalStatus(setTotalStatus(turns, cars));
        OutputView.printWinners(getWinner(cars));
    }

    private StringBuilder setTotalStatus(int turns, List<RacingCar> cars) {
        StringBuilder totalStatus = new StringBuilder();
        for (int i = 0; i < turns; i++) {
            oneRace(cars);
            totalStatus.append(RacingCar.oneRaceStatus(cars));
            totalStatus.append("\n");
        }
        return totalStatus;
    }

    private List<String> getNames() {
        String[] carNames = input.split("[,]");
        List<String> names = new ArrayList<>(Arrays.asList(carNames));
        Validator.validateNameDuplicated(names);
        return names;
    }

    private List<RacingCar> generateCars() {
        List<String> names = getNames();
        List<RacingCar> cars = new ArrayList<>();
        for (String name : names) {
            RacingCar car = new RacingCar(name);
            cars.add(car);
        }
        return cars;
    }

    private void oneRace(List<RacingCar> cars) {
        for (RacingCar car : cars) {
            car.go(car.getRandomNum());
        }
    }

    private String getWinner(List<RacingCar> cars) {
        int maxPosition = 0;
        for (RacingCar car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }

        List<String> winners = new ArrayList<>();
        for (RacingCar car : cars) {
            if (maxPosition == car.getPosition()) {
                winners.add(car.getName());
            }
        }
        return String.join(", ", winners);
    }
}
