package baseball.validation;

import java.util.List;

public class GameInputValidation {
    public GameInputValidation() {
    }

    public void validate(String numbers) {
        // 타입 체크
        try {
            Integer.parseInt(numbers);
        } catch (IllegalArgumentException e) {

        }

        // 숫자 길이 체크

        // 중복 체크

        // 숫자 범위

    }
}
