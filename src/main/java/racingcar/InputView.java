package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String[] getCarNames() {
        System.out.println(Messages.ASK_CAR_NAMES);
        String[] carNames = Console.readLine().split(",");
        return carNames;
    }
}