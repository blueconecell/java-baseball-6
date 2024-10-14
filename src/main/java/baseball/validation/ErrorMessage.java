package baseball.validation;

import baseball.common.GameValue;

public enum ErrorMessage {


    NUMBER_DUPLICATE("중복되는 숫자가 존재할 수 없습니다"),
    NUMBER_SIZE("숫자의 길이가 "+ GameValue.NUMBER_SIZE+"이여야 합니다"),
    NUMBER_TYPE("숫자로만 구성되어야 합니다"),
    NUMBER_RANGE(GameValue.MIN_RANGE + "부터" + GameValue.MAX_RANGE + "까지의 숫자로만 이루어져야 합니다");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
