package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    @DisplayName("전진 테스트")
    void 전진_테스트() {
        Car car = new Car("pobi");
        assertRandomNumberInRangeTest(
                car::move, MOVING_FORWARD
        );
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지 테스트")
    void 정지_테스트() {
        Car car = new Car("pobi");
        assertRandomNumberInRangeTest(
                car::move, STOP
        );
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Override
    public void runMain() {
    }
}