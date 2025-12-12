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
        List<RacingCar> cars = generateCars();
        totalRace(turns, cars);

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

    public void oneRace(List<RacingCar> cars) {
        for (RacingCar car : cars) {
            car.go();
        }
    }

    public void totalRace(int turns, List<RacingCar> cars) {
        for (int i = 0; i < turns; i++) {
            oneRace(cars);
        }
    }

    public StringBuilder totalRaceStatus(int turns, List<RacingCar> cars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < turns; i++) {
            sb.append(RacingCar.oneRaceStatus(cars)).append("\n");
        }
        return sb;
    }


}
