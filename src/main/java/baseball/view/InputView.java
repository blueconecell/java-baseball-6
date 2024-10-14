package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public InputView() {
    }

    public static String GameInputView() {
        String input = Console.readLine();
        //검증 하기
        return input;
    }

    public static String RetryInputView() {
        String input = Console.readLine();
        //검증 하기
        return input;
    }

}
