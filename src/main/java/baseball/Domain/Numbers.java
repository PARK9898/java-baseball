package baseball.Domain;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;


public class Numbers {
	private static NumberValidator numberValidator = new NumberValidator();
	private List<Integer> numbers = new ArrayList<>();


	private Numbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public static Numbers makeComputerNumbers(){
		List<Integer> comNumbers = new ArrayList<>();

		comNumbers = makeRandomNumbers();
		checkValidate(comNumbers);

		return new Numbers(comNumbers);
	}

	public static Numbers makePlayerNumbers(List<Integer> playerNum){
		checkValidate(playerNum);

		return new Numbers(playerNum);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public static List<Integer> makeRandomNumbers(){
		List<Integer> comNumbers = new ArrayList<>();
		while(comNumbers.size() < 3){
			int number = Randoms.pickNumberInRange(1,9);
			if(!comNumbers.contains(number)){
				comNumbers.add(number);
			}
		}
		return comNumbers;
	}

	private static void checkValidate(List<Integer> numbers){
		numberValidator.checkSize(numbers);
		numberValidator.checkDuplicate(numbers);
		numberValidator.checkRange(numbers);
	}

}
