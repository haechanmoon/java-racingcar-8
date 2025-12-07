package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.Console;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewTest {

    @AfterEach
    void tearDown() {
        Console.close();
    }

    @Test
    @DisplayName("입력값이 자연수일 때 성공")
    void 시도_횟수_입력_성공() {
        //given
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        //when
        int counts = InputView.readTurnCounts();

        //then
        assertThat(counts).isEqualTo(5);
    }

    @Test
    @DisplayName("입력값 예외처리")
    void 시도_횟수_입력_예외() {
        //given
        String input = "세번";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        //when&then
        assertThatThrownBy(InputView::readTurnCounts)
                .isInstanceOf(IllegalArgumentException.class);

    }

}