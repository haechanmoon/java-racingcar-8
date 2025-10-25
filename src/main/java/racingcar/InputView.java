package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public List<String> getCarNames() {
        System.out.println(Messages.ASK_CAR_NAMES);
        String[] carNames = Console.readLine().split(",");
        return List.of(carNames);
    }

    public int getTurns() {
        System.out.println(Messages.ASK_TURNS);
        int turns = Integer.parseInt(Console.readLine());
        return turns;
    }
}