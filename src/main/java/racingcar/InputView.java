package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readInput() {
        return Console.readLine();
    }

    public static int readTurnCounts() {
        return Integer.parseInt(Console.readLine());
    }
}
