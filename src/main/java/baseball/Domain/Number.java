package baseball.Domain;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;


public class Number {
	private static NumberValidator numberValidator = new NumberValidator();
	private List<Integer> numbers = new ArrayList<>();


	private Number(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public static Number ComputerNum(){

		List<Integer> ComNumbers = new ArrayList<>();
		while(ComNumbers.size() < 3){
			int number = Randoms.pickNumberInRange(1,9);
			if(!ComNumbers.contains(number)){
				ComNumbers.add(number);
			}
		}

		CheckValidate(ComNumbers);

		return new Number(ComNumbers);
	}

	public static Number PlayerNum(List<Integer> playerNum){
		CheckValidate(playerNum);

		return new Number(playerNum);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	private static void CheckValidate(List<Integer> numbers){
		numberValidator.checkSize(numbers);
		numberValidator.checkDuplicate(numbers);
		numberValidator.checkRange(numbers);
	}

}
