package baseball;

import baseball.Controller.Game;
import baseball.View.InputView;
import baseball.View.OutputView;

public class Application {

    private static final InputView INPUT_VIEW = new InputView();
    private static final OutputView OUTPUT_VIEW = new OutputView();

    public static void main(String[] args) {
        OUTPUT_VIEW.printStart();
        do {
            new Game().playGame();
        }
        while (INPUT_VIEW.StopOrContinue());
    }
}
