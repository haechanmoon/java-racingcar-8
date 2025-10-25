package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

    public static void validateCarNames(List<String> names) {
        Set<String> onlyOneName = new HashSet<>();
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다. 구분자를 확인하세요");
            }
            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름이 공백일 수 없습니다.");
            }
            if (!onlyOneName.add(name)) {
                throw new IllegalArgumentException("이름은 중복될 수 없습니다.");
            }
        }
    }
}
