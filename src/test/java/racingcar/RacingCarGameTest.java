package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarGameTest {

    @Test
    @DisplayName("공동우승자 확인")
    void 공동우승자_확인() {
        //given
        RacingCar pobi = new RacingCar("pobi");
        pobi.go(5);
        pobi.go(5);
        RacingCar woni = new RacingCar("woni");
        woni.go(5);
        woni.go(5);

        List<RacingCar> cars = List.of(pobi, woni);

        //when
        List<String> winners = RacingCarGame.selectChampion(cars);

        //then
        assertThat(winners).containsExactly("pobi", "woni");
    }

    @Test
    @DisplayName("단독우승자 확인")
    void 단독우승자_확인() {
        //given
        RacingCar pobi = new RacingCar("pobi");
        pobi.go(5);
        pobi.go(5);
        RacingCar woni = new RacingCar("woni");
        woni.go(5);
        woni.go(0);

        List<RacingCar> cars = List.of(pobi, woni);

        //when
        List<String> winners = RacingCarGame.selectChampion(cars);

        //then
        assertThat(winners).containsExactly("pobi");
    }
}