package racingcar;

import java.util.List;

public class OutputView {
    public void printTurnResult(List<Car> cars) {
        StringBuilder carsStringBuilder = new StringBuilder();
        for (Car car : cars) {

            String name = car.getName();
            int position = car.getPosition();

            carsStringBuilder
                    .append(name)
                    .append(" : ")
                    .append(convertPositionToHyphens(position))
                    .append("\n");
        }
        System.out.println(carsStringBuilder);
    }

    private String convertPositionToHyphens(int position) {
        return "-".repeat(Math.max(0, position));
    }
}
