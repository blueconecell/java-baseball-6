package baseball.model;

import baseball.common.GameValue;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Number {

    private final List<Integer> number;

    public Number(List<Integer> number) {
        this.number = number;
    }

    public Number createComputerNumbers() {
        List<Integer> computerNumbers = Randoms.pickUniqueNumbersInRange(
                GameValue.MIN_RANGE.getValue(),
                GameValue.MAX_RANGE.getValue(),
                GameValue.NUMBER_SIZE.getValue()
        );
        return new Number(computerNumbers);
    }

    public Number createPlayerNumbers(String numbers) {
        List<Integer> playerNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            int element = numbers.charAt(i) - '0';
            playerNumbers.add(element);
        }
        return new Number(playerNumbers);

    }
}