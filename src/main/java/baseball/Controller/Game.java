package baseball.Controller;

import baseball.Domain.CompareNumber;
import baseball.Domain.Number;
import baseball.View.InputView;
import baseball.View.OutputView;

public class Game {

	private InputView inputView = new InputView();
	private OutputView outputView = new OutputView();
	private CompareNumber compareNumber = new CompareNumber();

	private Number computerNumber;
	private Number playerNumber;

	public Game() {
		this.computerNumber = Number.ComputerNum();

	}


	public void playGame(){
		playerNumber = Number.PlayerNum(inputView.inputNumbers());

		outputView.printResult(compareNumber.Strike(computerNumber.getNumbers() ,playerNumber.getNumbers()),
			compareNumber.Ball(computerNumber.getNumbers() ,playerNumber.getNumbers()));

		if(compareNumber.Strike(computerNumber.getNumbers() ,playerNumber.getNumbers()) == 3){
			outputView.printFinsh();
			return;
		}
		playGame();

	}



}
