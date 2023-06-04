package baseball.View;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	public List<Integer> inputNumbers(){

		List<Integer> inputNum = new ArrayList<>();

		System.out.println("숫자를 입력해주세요 : ");
		String input = Console.readLine();

		for(int i = 0; i < input.length() ; i++){
			int number = Character.getNumericValue(input.charAt(i));
			if(number == -1){
				throw new IllegalArgumentException("문자가 아닌 숫자를 입력해주세요.");
			}else{
				inputNum.add(Character.getNumericValue(input.charAt(i)));
			}
		}
		return inputNum;
	}

	public boolean StopOrContinue(){
		System.out.println("게임을 새로 시작하려면 1 종료하려면 2를 눌러주세요");
		int number = Integer.parseInt(Console.readLine());

		if(number == 1){
			return true;
		}
		if(number == 2){
			return false;
		}
		return StopOrContinue();
	}


}
