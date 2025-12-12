package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class RacingCarTest {

    @Test
    void move_forward() {
        RacingCar car = new RacingCar("pobi");
        car.go(4); // 4 이상이면 전진
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void stop() {
        RacingCar car = new RacingCar("woni");
        car.go(3); // 3 이하이면 정지
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void position_to_dash() {
        RacingCar car = new RacingCar("pobi");
        car.go(4);
        car.go(4);
        // 위치 2일 때 "--"가 나오는지 확인
        // oneRaceStatus는 "이름 : --\n" 형식이므로 포함 여부 확인
        String status = RacingCar.oneRaceStatus(List.of(car)).toString();
        assertThat(status).contains("pobi : --");
    }
}