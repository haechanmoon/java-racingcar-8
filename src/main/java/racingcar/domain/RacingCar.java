package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {

    private static final int MIN_RANDOM_NUM = 0;
    private static final int MAX_RANDOM_NUM = 9;
    private static final int STANDARD_NUM = 4;
    private int position;
    private final String name;

    public RacingCar(String name) {
        this.name = name;
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

}
