package baseball.Domain;

import java.util.List;

public class CompareNumber {

	public int countStrike(List<Integer> playerNum, List<Integer> comNum){
		int strikeCount = 0;
		for(int i = 0; i < playerNum.size() ; i++){
			if(playerNum.get(i) == comNum.get(i)){
				strikeCount++;
			}
		}
		return strikeCount;
	}

	public int countBall(List<Integer> playerNum, List<Integer> comNum){
		int ballCount = 0;
		for(int i = 0; i < playerNum.size(); i++){
			if(playerNum.get(i) != comNum.get(i) && comNum.contains(playerNum.get(i))){
				ballCount++;
			}
		}
		return ballCount;
	}
}
