package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}