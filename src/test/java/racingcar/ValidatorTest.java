package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    void 이름이_5자를_넘으면_예외_발생() {
        // given
        List<String> names = List.of("pobi", "javajigi"); // 7자

        // when & then
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

}