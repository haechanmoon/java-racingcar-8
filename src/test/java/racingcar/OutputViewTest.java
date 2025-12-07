package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OutputViewTest extends NsTest {
    private static int FOWARD = 5;

    @Test
    @DisplayName("현재 위치 출력 확인")
    void 현재_위치_출력_확인() {
        //given
        RacingCar pobi = new RacingCar("pobi");
        pobi.go(FOWARD);
        RacingCar woni = new RacingCar("woni");
        woni.go(FOWARD);
        woni.go(FOWARD);
        List<RacingCar> cars = List.of(pobi, woni);

        //when
        OutputView.printCurrentStatus(cars);

        //then
        assertThat(output()).contains(
                "pobi : -",
                "woni : --"
        );
    }

    @Override
    protected void runMain() {

    }
}