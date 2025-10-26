package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    @DisplayName("이름이 5자를 초과하면 예외 발생")
    void 이름이_5자를_넘으면_예외_발생() {
        List<String> names = List.of("pobi", "javajigi");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_LENGTH);
    }

    @Test
    @DisplayName("이름이 중복되면 예외 발생")
    void 이름이_중복되면_예외_발생() {
        List<String> names = List.of("pobi", "woni", "pobi");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_DUPLICATE);
    }

    @Test
    @DisplayName("이름이 빈 문자열이면 예외 발생")
    void 이름이_빈문자열_예외_발생() {
        List<String> names = List.of("pobi", "", "woni");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_EMPTY);
    }

    @Test
    @DisplayName("이름이 공백만 있으면 예외 발생")
    void 이름이_공백_예외_발생() {
        List<String> names = List.of("pobi", " ", "woni");
        assertThatThrownBy(() -> Validator.validateCarNames(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_NAME_EMPTY);
    }

    @Test
    @DisplayName("시도 횟수가 숫자가 아니면 예외 발생")
    void 시도_횟수가_숫자가_아닐때_예외_발생() {
        String input = "r";
        assertThatThrownBy(() -> Validator.validateTurns(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_TURNS_NOT_A_NUMBER);
    }

    @Test
    @DisplayName("시도 횟수가 음수이면 예외 발생")
    void 시도_횟수가_음수일때_예외_발생() {
        String input = "-3";
        assertThatThrownBy(() -> Validator.validateTurns(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_TURNS_POSITIVE_INTEGER);
    }

    @Test
    @DisplayName("시도 횟수가 0이면 예외 발생")
    void 시도_횟수가_0일때_예외_발생() {
        String input = "0";
        assertThatThrownBy(() -> Validator.validateTurns(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Messages.ERROR_TURNS_POSITIVE_INTEGER);
    }
}