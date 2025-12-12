package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.utils.Validator;

public class RacingCar {

    private static final int MIN_RANDOM_NUM = 0;
    private static final int MAX_RANDOM_NUM = 9;
    private static final int STANDARD_NUM = 4;
    private int position;
    private final String name;

    public RacingCar(String name) {
        this.name = name.trim();
        Validator.validateCarNames(this.name);
        position = 0;
    }

    public void go() {
        if (STANDARD_NUM <= getRandomNum()) {
            position++;
        }
    }

    public int getRandomNum() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public static StringBuilder oneRaceStatus(List<RacingCar> cars) {
        StringBuilder sb = new StringBuilder();
        for (RacingCar car : cars) {
            sb.append(car.getName()).append(" : ").append(positionToDash(car)).append("\n");
        }
        return sb;
    }

    private static StringBuilder positionToDash(RacingCar car) {
        int position = car.getPosition();
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(Math.max(0, position)));
        return sb;
    }

}
