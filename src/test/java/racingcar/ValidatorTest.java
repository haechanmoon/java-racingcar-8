package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    @DisplayName("이름이 6자 넘으면 에러확인")
    void 이름이_6자_넘으면_에러나는지_확인() {
        //given
        String name = "justhis";

        //when,then
        assertThatThrownBy(() -> Validator.validateNameLength(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_OVER_NAME);
    }

    @Test
    @DisplayName("자동차 이름이 공백일 때 에러확인")
    void 자동차_이름_공백일_때_에러_확인() {
        //given
        String name = "";

        //when,then
        assertThatThrownBy(() -> Validator.validateNameEmpty(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_CAR_NAME_EMPTY);
    }

    @Test
    @DisplayName("이름 입력값이 공백일 때 에러확인")
    void 이름_입력값이_공백일_때_에러_확인() {
        //given
        String input = "";

        //when,then
        assertThatThrownBy(() -> Validator.validateEmpty(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_EMPTY);
    }
}