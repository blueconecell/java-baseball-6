package baseball.dto;

public class CountDto {

    private final int strike;
    private final int ball;

    public CountDto(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
