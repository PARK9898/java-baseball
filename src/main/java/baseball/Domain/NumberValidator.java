package baseball.Domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class NumberValidator {

	private static final int MAX = 9;
	private static final int MIN = 1;

	public void checkDuplicate(List<Integer> numbers){
		Set<Integer> numberSet = new HashSet<>(numbers);
		if(numberSet.size() != numbers.size()) {
			throw new IllegalArgumentException("숫자는 중복되면 안됩니다");
		}
	}

	public void checkRange(List<Integer> numbers){
		for(Integer a : numbers){
			if(a < MIN || MAX < a){
				throw new IllegalArgumentException("숫자는" + MIN + "이상" + MAX + "이하여야 합니다.");
			}
		}
	}

	public void checkSize(List<Integer> numbers){
		if(numbers.size() != 3){
			throw new IllegalArgumentException("숫자는 3자리수여야 합니다");
		}
	}

}
