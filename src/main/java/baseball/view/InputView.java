package baseball.view;

import baseball.validation.GameInputValidation;
import baseball.validation.RetryInputValidation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public InputView() {
    }

    public static String GameInputView() {
        String input = Console.readLine();
        GameInputValidation.validate(input);


        //검증 하기
        return input;
    }

    public static String RetryInputView() {
        String input = Console.readLine();
        RetryInputValidation.validate(input);
        //검증 하기
        return input;
    }

}
