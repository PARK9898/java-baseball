package baseball.Controller;

import baseball.Domain.CompareNumber;
import baseball.Domain.Numbers;
import baseball.View.InputView;
import baseball.View.OutputView;

public class Game {

	private InputView inputView = new InputView();
	private OutputView outputView = new OutputView();
	private CompareNumber compareNumber = new CompareNumber();


	public void playGame(){
		Numbers playerNumbers = Numbers.PlayerNumbers(inputView.inputNumbers());
		Numbers computerNumbers = Numbers.ComputerNumbers();

		outputView.printResult(compareNumber.countStrike(computerNumbers.getNumbers() ,playerNumbers.getNumbers()),
			compareNumber.countBall(computerNumbers.getNumbers() ,playerNumbers.getNumbers()));

		if(compareNumber.countStrike(computerNumbers.getNumbers() ,playerNumbers.getNumbers()) == 3){
			outputView.printFinish();
			return;
		}
		playGame();
	}
}
