package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {

    private static final int RANDOM_MIN_NUMBER = 0;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int STANDARD_NUMBER = 4;
    private static final String CONVERT_POSITION_CHARACTER = "-";
    private int position;
    private final String name;

    public RacingCar(String name) {
        this.name = name;
        position = 0;
    }

    public void go() {
        int random = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
        if (random >= STANDARD_NUMBER) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public StringBuilder invertPosition() {
        int position = getPosition();
        StringBuilder bar = new StringBuilder();
        bar.append(CONVERT_POSITION_CHARACTER.repeat(Math.max(0, position)));
        return bar;
    }
}