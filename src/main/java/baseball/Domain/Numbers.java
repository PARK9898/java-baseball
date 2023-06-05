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

	public static Numbers ComputerNumbers(){

		List<Integer> ComNumbers = new ArrayList<>();
		while(ComNumbers.size() < 3){
			int number = Randoms.pickNumberInRange(1,9);
			if(!ComNumbers.contains(number)){
				ComNumbers.add(number);
			}
		}

		checkValidate(ComNumbers);

		return new Numbers(ComNumbers);
	}

	public static Numbers PlayerNumbers(List<Integer> playerNum){
		checkValidate(playerNum);

		return new Numbers(playerNum);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	private static void checkValidate(List<Integer> numbers){
		numberValidator.checkSize(numbers);
		numberValidator.checkDuplicate(numbers);
		numberValidator.checkRange(numbers);
	}

}
