package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readInputNames() {
        return Console.readLine();
    }

    public int readTurnCounts() {
        return Integer.parseInt(Console.readLine());
    }

}
