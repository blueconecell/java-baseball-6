package baseball.common;

public enum GameValue {
    NUMBER_SIZE(3),
    MIN_RANGE(1),
    MAX_RANGE(9),
    RETRY_SIGNAL(1),
    END_SIGNAL(2),
    WIN_COND(3);


    private final int value;

    GameValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
