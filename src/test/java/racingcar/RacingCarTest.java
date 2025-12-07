package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarTest extends NsTest {

    @Override
    protected void runMain() {
    }

    @Test
    @DisplayName("자동차 전진 확인")
    void 자동차_전진_확인() {
        //given
        RacingCar car = new RacingCar("pobi");

        //when
        car.go(5);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }


}