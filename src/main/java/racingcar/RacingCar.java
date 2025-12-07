package racingcar;

public class RacingCar {

    private static final int STANDARD_NUMBER = 4;
    private static final String CONVERT_POSITION_CHARACTER = "-";
    private int position;
    private final String name;

    public RacingCar(String name) {
        this.name = name;
        position = 0;
        Validator.validateNameLength(this.name);
    }

    public void go(int number) {
        if (number >= STANDARD_NUMBER) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public StringBuilder getPositionDash() {
        int position = getPosition();
        StringBuilder bar = new StringBuilder();
        bar.append(CONVERT_POSITION_CHARACTER.repeat(Math.max(0, position)));
        return bar;
    }
}