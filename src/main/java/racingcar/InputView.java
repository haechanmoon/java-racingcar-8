package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String[] getCarNames() {
        System.out.println(Messages.ASK_CAR_NAMES);
        String[] carNames = Console.readLine().split(",");
        return carNames;
    }

    public int getTurns() {
        System.out.println(Messages.ASK_TURNS);
        int turns = Integer.parseInt(Console.readLine());
        return turns;
    }
}