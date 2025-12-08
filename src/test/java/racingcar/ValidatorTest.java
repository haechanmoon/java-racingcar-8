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
}