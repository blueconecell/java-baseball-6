package baseball.view;

public class OutputView {
    private OutputView() {
    }

    public static void printGameStartView() {
        System.out.println(ViewMessage.START_GAME.getViewMessage());
    }
    public static void printRetryView(){
        System.out.println(ViewMessage.RETRY.getViewMessage());
    }
    public static void printPlayerNumberView(){
        System.out.println(ViewMessage.INPUT_NUMBER.getViewMessage());
    }
    public static void printWinView(){
        System.out.println(ViewMessage.WIN.getViewMessage());
    }
    // 볼 스트라이크 여부 계산 하여 추가 해야함
}   
