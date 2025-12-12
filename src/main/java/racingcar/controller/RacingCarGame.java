package racingcar.controller;


import racingcar.views.InputView;
import racingcar.views.OutputView;

public class RacingCarGame {

    public void start() {
        OutputView.requestCarNameMessage();
        String input = InputView.getCarNames();

    }
}
