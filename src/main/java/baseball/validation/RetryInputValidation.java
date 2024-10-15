package baseball.validation;

import baseball.common.GameValue;

public class RetryInputValidation {
    private RetryInputValidation() {
    }

    public static void validate(String numbers) {
        // 입력 값이 비어 있는지 체크
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_BLANK.getMessage());
        }

        // 타입 체크
        try {
            Integer.parseInt(numbers);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_TYPE.getMessage());
        }

        // 입력 체크
        if (!numbers.equals(Integer.toString(GameValue.RETRY_SIGNAL.getValue()))) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_RETRY.getMessage());
        }
    }
}
