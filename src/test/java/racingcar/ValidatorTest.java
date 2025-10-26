package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    void 이름이_5자를_넘으면_예외_발생() {
        List<String> names = List.of("pobi", "javajigi");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_중복되면_예외_발생() {
        List<String> names = List.of("pobi", "woni", "pobi");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_공백_빈문자열_예외_발생() {
        List<String> names = List.of("", "");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 시도_횟수가_숫자가_아닐때_예외_발생() {
        String input = "r";
        assertThatThrownBy(() -> Validator.validateTurns(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 시도_횟수가_0이하_정수일때_예외_발생() {
        String input = "-3";
        assertThatThrownBy(() -> Validator.validateTurns(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}