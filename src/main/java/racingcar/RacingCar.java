package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private int position;
    private final String name;

    public RacingCar(String name) {
        this.name = name;
        position = 0;
    }

    public void go() {
        int random = Randoms.pickNumberInRange(0, 9);
        if (random >= 4) {
            position++;
        }
    }
}