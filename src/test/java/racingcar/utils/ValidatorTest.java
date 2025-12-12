package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {

    @Test
    @DisplayName("이름이 기준치 초과일 때 예외처리 후 종료 확인")
    void 이름이_기준치_초과일_때() {
        //given
        String name = "banana";

        //when,then
        assertThatThrownBy(() -> Validator.validateCarNames(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_TOO_LONG);
    }

    @Test
    @DisplayName("입력이 공백일때 예외처리 후 종료 확인")
    void 입력이_공백일_때() {
        //given
        String input = "";

        //when,then
        assertThatThrownBy(() -> Validator.validateIsEmpty(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_EMPTY);
    }

    @ParameterizedTest
    @DisplayName("시도할 횟수 입력이 [0,1fe,aaa] 일때 예외처리 후 종료 확인")
    @ValueSource(strings = {"0", "1fe", "aaa"})
    void 시도할_횟수_입력이_1이상의_자연수가_아닐_때(String turns) {
        assertThatThrownBy(() -> Validator.validateTurns(turns))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_IS_NOT_DIGIT);
    }

    @Test
    @DisplayName("이름이 중복됐을 때 예외처리 후 종료 확인")
    void 이름이_중복됐을_때() {
        //given
        List<String> names = List.of("pobi", "pobi", "woni");

        //when,then
        assertThatThrownBy(() -> Validator.validateNameDuplicated(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_DUPLICATED);
    }

}