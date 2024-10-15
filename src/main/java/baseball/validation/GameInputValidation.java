package baseball.validation;

import baseball.common.GameValue;
import baseball.model.Number;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameInputValidation {
    private GameInputValidation() {
    }

    public static void validate(String numbers)  {
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

        // 숫자 길이 체크
        if (numbers.length() != GameValue.NUMBER_SIZE.getValue()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_SIZE.getMessage());
        }

        
        // 중복 체크
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < numbers.length(); i++) {
            charSet.add(numbers.charAt(i));
        }
        if (charSet.size() != GameValue.NUMBER_SIZE.getValue()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_DUPLICATE.getMessage());
        }
        // 숫자 범위
        for (int i = 0; i < numbers.length(); i++) {
            char number = numbers.charAt(i);
            checkRange(number);
        }

    }

    private static void checkRange(char number) {
        if (number - '0' < GameValue.MIN_RANGE.getValue() || number - '0' > GameValue.MAX_RANGE.getValue()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_RANGE.getMessage());
        }
    }
}
