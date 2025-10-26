package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    public List<String> getCarNames() {
        System.out.println(Messages.ASK_CAR_NAMES);
        String[] carNamesArray = Console.readLine().split(",");
        List<String> carNamesList = new ArrayList<>();
        for (String name : carNamesArray) {
            carNamesList.add(name.trim());
        }

        Validator.validateCarNames(carNamesList);
        return carNamesList;
    }

    public int getTurns() {
        System.out.println(Messages.ASK_TURNS);
        String input = Console.readLine();
        return Validator.validateTurns(input);
    }
}