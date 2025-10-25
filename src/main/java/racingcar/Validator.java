package racingcar;

import java.util.List;

public class Validator {

    public static void validateCarNames(List<String> names) {
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }

    }
}
